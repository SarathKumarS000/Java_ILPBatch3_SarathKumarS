package com.experion.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.experion.entity.Customer;

public class CustomerNameSorting {
	
	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Sarath", 21));
		customerList.add(new Customer("Suneesh",36));
		customerList.add(new Customer("Rahul", 25));
		customerList.add(new Customer("Vivin", 31));
		customerList.add(new Customer("Sreeni", 24));
		Collections.sort(customerList);
		System.out.println(customerList);
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName());
		}
		
		
		
		
	}

}
