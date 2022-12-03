package com.experion.utility;

import com.experion.entity.Customer;
import com.experion.service.CustomerService;

public class CustomerUtility {

	public static void main(String[] args) {


		Customer[] customerArray = new Customer[3];
		customerArray = CustomerService.createCustomerList();
		CustomerService.displayCustomerArray(customerArray);
	}

}
