package com.experion.entity;

public class Customer {

	private String customerCode;
	private String customerName;
	private String customerCategory;
	public Customer(String customerCode, String customerName, String customerCategory) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerCategory = customerCategory;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
}
