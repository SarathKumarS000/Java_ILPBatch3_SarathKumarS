package com.experion.entity;

import java.util.Date;
import java.util.Scanner;

import com.experion.service.ElectronicService;

public class Electronics extends Product implements ElectronicService {

	private int serviceCharge;
	private Date warrantyDate;

	public Electronics(String productCode, String productName, double productPrice, int serviceCharge,
			Date warrantyDate) {
		super(productCode, productName, productPrice);
		this.serviceCharge = serviceCharge;
		this.warrantyDate = warrantyDate;
	}

	@Override
	public void ProductRepair() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nWhat is your product issue? ");
		System.out.println("1. Physical Damage		2. Not Working");
		int choice = scanner.nextInt();
		switch (choice){
		case 1:
			System.out.println("\nYour product is repaired.");
			break;
		case 2:
			System.out.println("\nRepaired successfully and works properly.");
			break;
		}
	}

	@Override
	public void warrantyReplacement(Date warrantyDate, Date currentDate) {
		if (getWarrantyDate().after(currentDate) || getWarrantyDate().equals(currentDate)) {
			System.out.println("\nYour product approved for replacement.");
		} else {
			System.out.println("\nNot valid for replacement. Your products warranty has been expired.");
		}

	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Date getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(Date warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

}
