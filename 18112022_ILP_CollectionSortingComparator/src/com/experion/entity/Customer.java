package com.experion.entity;

public class Customer{
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
