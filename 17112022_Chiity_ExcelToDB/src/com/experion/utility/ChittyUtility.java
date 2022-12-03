package com.experion.utility;

import java.io.File;
import java.util.List;

import com.experion.entity.Customer;
import com.experion.service.ChittyService;
import com.experion.service.ChittyServiceImpl;
import com.poiji.bind.Poiji;

public class ChittyUtility {

	
	private static ChittyService chittyService = new ChittyServiceImpl();
	public static void main(String[] args) {
		File file = new File("D:/chitty.xlsx");
		List<Customer> customerList = Poiji.fromExcel(file, Customer.class);
		System.out.println("Customer Id" + "         " + "Customer Name" + "         " + "Joining Date" + "         "
				+ "Chitty Type");
		for (Customer customer : customerList) {
			System.out.println(customer.getCustomerId() + "                " + customer.getCustomerName()
					+ "              " + customer.getJoiningDate() + "                   " + customer.getChittyType());
			chittyService.saveCustomer(customer);
		}
	}

}
