package com.experion.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

@Entity
public class Customer {
	@ExcelRow
	private int rowIndex;
	@ExcelCellName("customerId")
	private String customerId;
	@ExcelCellName("customerName")
	private String customerName;
	@ExcelCellName("joiningDate")
	private Date joiningDate;
	@ExcelCellName("chittyType")
	private String chittyType;
	
	public Customer()
	{
		
	}
	public Customer(String customerId, String customerName, Date joiningDate, String chittyType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.joiningDate = joiningDate;
		this.chittyType = chittyType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getChittyType() {
		return chittyType;
	}
	public void setChittyType(String chittyType) {
		this.chittyType = chittyType;
	}
	
}
