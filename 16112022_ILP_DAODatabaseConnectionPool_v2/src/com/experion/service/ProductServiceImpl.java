package com.experion.service;

import java.util.List;

import com.experion.dao.ProductDao;
import com.experion.dao.ProductDaoImpl;
import com.experion.entity.Product;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao = new ProductDaoImpl();
	@Override
	public void saveProduct(Product product) {
		productDao.saveProduct(product);
	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return productDao.listAllProducts();
	}

	@Override
	public Product getProduct(String productCode) {
		// TODO Auto-generated method stub
		return productDao.getProduct(productCode);
	}

	@Override
	public void deleteProduct(String productCode) {
		productDao.deleteProduct(productCode);
	}

}
