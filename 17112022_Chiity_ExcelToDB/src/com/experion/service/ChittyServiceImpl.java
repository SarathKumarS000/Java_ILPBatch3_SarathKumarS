package com.experion.service;

import com.experion.dao.ChittyDao;
import com.experion.dao.ChittyDaoImpl;
import com.experion.entity.Customer;

public class ChittyServiceImpl implements ChittyService{
	ChittyDao chittydao = new ChittyDaoImpl();

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		chittydao.saveCustomer(customer);
	}

}
