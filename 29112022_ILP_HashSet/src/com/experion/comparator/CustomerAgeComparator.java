package com.experion.comparator;

import java.util.Comparator;

import com.experion.entity.Customer;

public class CustomerAgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getCustomerAge() - o2.getCustomerAge();
	}

}
