package com.experion.entity;

import java.util.Date;
import java.util.Scanner;

import com.experion.service.FabricService;

public class Fabrics extends Product implements FabricService {

	public Fabrics(String productCode, String productName, double productPrice) {
		super(productCode, productName, productPrice);

	}

	@Override
	public void productExchange(String productName) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nThe product you bought is " + productName);
		System.out.println("\nReason for exchange?");
		System.out.println("1. Size		2. Defective 	3. No Reason");
		int choice = scanner.nextInt();
		switch (choice){
		case 1:
		case 2:
			System.out.println(productName + " is exchanged.");
			break;
		case 3:
			System.out.println("As per shop policy cannot return or exchange product without reason.");
			break;
		}
		
	}

}
