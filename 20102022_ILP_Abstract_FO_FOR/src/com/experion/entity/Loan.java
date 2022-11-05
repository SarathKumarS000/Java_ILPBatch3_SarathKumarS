package com.experion.entity;

import com.experion.service.LoanService;

public class Loan extends Product implements LoanService{

	private String loanNumber;
	private double loanAmount;

	public Loan(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of Loan class called");
	}

	@Override
	public void checkDueDate() {
		System.out.println("Checking due date.");
	}

	@Override
	public void approveLoan() {
		System.out.println("Loan is approved.");
	}

}
