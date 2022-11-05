package com.experion.entity;

import java.util.Scanner;

public class Product {
	String productCode, productName, productDescription;
	double productPrice;
	String openDate, validityDate, expiryDate;
	boolean active;
	
	public void inputProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name : ");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description : ");
		productDescription = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date : ");
		openDate = scanner.nextLine();
		System.out.println("Enter Product Validity Date : ");
		validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date : ");
		expiryDate = scanner.nextLine();
		System.out.println("Enter Product Active Status : ");
		active = scanner.nextBoolean();
	}
	public void displayProductDetails() {
		System.out.println("Product Code " + "	" + "Product Name " + "	" + "Product Description " + "	" + "Product Price " +
					  	   "	" + "Product Open Date " + "	" + "Product Validity Date " + "	" + "Product Expiry Date "  + 
					  	   "	" + "Product Active Status ");
		System.out.println(productCode + "		" + productName + "		" + productDescription +  "		" + productPrice +  
							"		" + openDate +  "		" + validityDate +  "		" + expiryDate +  "		" + active);
	}
}
