package com.experion.entity;

public class Product {
	private String productCode, productName, productDescription;
	private double productPrice;
	private char productAdd;

	public Product(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getProductAdd() {
		return productAdd;
	}

	public void setProductAdd(char productAdd) {
		this.productAdd = productAdd;
	}

}
