package com.experion.entity;

import java.util.Date;

public class Product {
	private String productCode, productName, productDescription;
	private double productPrice;
	private Date openDate, validityDate, expiryDate;
	private boolean active;
	private static int serialNo = 0;
	private int serialNoOriginal;

	public Product(String productCode, String productName, String productDescription, double productPrice,
			Date openDate, Date validityDate, Date expiryDate) {
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		Product.serialNo = serialNo;
	}

	public int getSerialNoOriginal() {
		return serialNoOriginal;
	}

	public void setSerialNoOriginal(int serialNoOriginal) {
		this.serialNoOriginal = serialNoOriginal;
	}

}
