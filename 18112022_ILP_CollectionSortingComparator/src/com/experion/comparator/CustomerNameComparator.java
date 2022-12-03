package com.experion.comparator;

import java.util.Comparator;

import com.experion.entity.Customer;

public class CustomerNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

}
