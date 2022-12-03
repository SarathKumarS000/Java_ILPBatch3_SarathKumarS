package com.experion.entity;

import java.util.Objects;

public class Customer{
	@Override
	public int hashCode() {
		return Objects.hash(customerAge, customerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerAge == other.customerAge && Objects.equals(customerName, other.customerName);
	}
	String customerName;
	int customerAge;
	public Customer(String customerName, int customerAge) {
		super();
		this.customerName = customerName;
		this.customerAge = customerAge;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
}
