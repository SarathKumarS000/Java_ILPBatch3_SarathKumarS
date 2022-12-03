package com.experion.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.experion.comparator.CustomerAgeComparator;
import com.experion.comparator.CustomerNameComparator;
import com.experion.entity.Customer;

public class CustomerNameSorting {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String sortingParameter = "";
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Sarath", 21));
		customerList.add(new Customer("Suneesh",36));
		customerList.add(new Customer("Rahul", 25));
		customerList.add(new Customer("Vivin", 31));
		customerList.add(new Customer("Sreeni", 24));
		System.out.println("Before Sorting");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());
		}
		
//		do {
			System.out.println("1. Sort based on Name 2. Sort based on Age");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1 : Collections.sort(customerList, new CustomerNameComparator());
					 sortingParameter = "Customer List After Sorting Based on Name";
				  	 break;
			case 2:  Collections.sort(customerList, new CustomerAgeComparator());
					 sortingParameter = "Customer List After Sorting Based on Age";
					 break;
			}
			System.out.println(sortingParameter);
			for(Customer customer : customerList) {
				System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());
			}
//		}
		
		
	}

}
