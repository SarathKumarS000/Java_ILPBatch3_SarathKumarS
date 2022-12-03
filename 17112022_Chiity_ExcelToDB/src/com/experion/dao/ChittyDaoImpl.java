package com.experion.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.experion.connectionpool.ConnectionPool;
import com.experion.entity.Customer;

public class ChittyDaoImpl implements ChittyDao{

	@Override
	public void saveCustomer(Customer customer) {
		Connection connection = null;
		String selectSQL = "insert into customer (customer_id, customer_name, joining_date, chitty_type) values (?,?,?,?)";
		PreparedStatement prepStmt = null;
		try {
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setString(1, customer.getCustomerId());
			prepStmt.setString(2, customer.getCustomerName());
			prepStmt.setDate(3, new Date(customer.getJoiningDate().getTime()));
			prepStmt.setString(4, customer.getChittyType());
			prepStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
