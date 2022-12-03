package com.experion.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.experion.connectionpool.ConnectionPool;
import com.experion.entity.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void saveProduct(Product product) {
		Connection connection = null;
		String selectSQL = "insert into product (productcode, productname, productdescription, activationdate, expirtydate) values (?,?,?,?,?)";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setString(1, product.getProductCode());
			prepStmt.setString(2, product.getProductName());
			prepStmt.setString(3, product.getProductDescription());
			prepStmt.setDate(4, new Date(product.getActivationDate().getTime()));
			prepStmt.setDate(5, new Date(product.getExpiryDate().getTime()));
			prepStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Product> listAllProducts() {
		List<Product> productList = new ArrayList<Product>();
		Connection connection = null;
		String selectSQL = "select * from product";
		PreparedStatement prepStmt = null;

		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			ResultSet resultSet = prepStmt.executeQuery();

			while (resultSet.next()) {
				productList.add(new Product(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getDate(5), resultSet.getDate(6)));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public Product getProduct(String productCode) {
		Connection connection = null;
		String selectSQL = "select * from product where productcode = ?";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setString(1, productCode);
			ResultSet resultSet = prepStmt.executeQuery();
			while (resultSet.next())
				System.out.println(resultSet.getString(3) + "	" + resultSet.getString(4) + " 		"
						+ resultSet.getString(5) + " 		" + resultSet.getString(6));
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public void deleteProduct(String productCode) {
		Connection connection = null;
		String selectSQL = "delete from product where productcode = ?";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setString(1, productCode);
			prepStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
