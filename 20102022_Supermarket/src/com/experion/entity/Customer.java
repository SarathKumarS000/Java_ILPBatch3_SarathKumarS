package com.experion.entity;

public class Customer {
	
	private String customerCode;
	private String customerName;
	Product product;
	public Customer(String customerCode, String customerName, Product product) {
		
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.product = product;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
