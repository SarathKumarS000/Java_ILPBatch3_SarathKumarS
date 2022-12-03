package com.experion.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.experion.entity.Customer;

public class HashSetUtility {
	
	public static void main(String[] args) {
		
		Set <Customer> customerHashSet = new HashSet();
		customerHashSet.add(new Customer("Sarath", 21));
		customerHashSet.add(new Customer("Suneesh",36));
		customerHashSet.add(new Customer("Rahul", 25));
		customerHashSet.add(new Customer("Vivin", 31));
		customerHashSet.add(new Customer("Sarath", 21));
		System.out.println("Printing from hash set");
		System.out.println("Name"+ "	"+ "Age");
		
		for(Customer customer : customerHashSet)
			System.out.println(customer.getCustomerName() + "	" + customer.getCustomerAge());
	}

}
