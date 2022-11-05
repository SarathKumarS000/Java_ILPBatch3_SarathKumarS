package com.experion.service;

import com.experion.entity.Product;

import java.util.Scanner;

public class Service {

	public static Product createProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		// product.setProductCode(productCode);
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		// product.setProductName(productName);
		System.out.println("Enter Product Description : ");
		String productDescription = scanner.nextLine();
		// product.setProductDescription(productDescription);
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		// product.setProductPrice(productPrice);
		scanner.nextLine();
		System.out.println("Enter Product Open Date : ");
		String openDate = scanner.nextLine();
		// product.setOpenDate(openDate);
		System.out.println("Enter Product Validity Date : ");
		String validityDate = scanner.nextLine();
		// product.setValidityDate(validityDate);
		System.out.println("Enter Product Expiry Date : ");
		String expiryDate = scanner.nextLine();
		// product.setExpiryDate(expiryDate);
		System.out.println("Enter Product Active Status : ");
		boolean active = scanner.nextBoolean();
		// product.setActive(active);

		Product product = new Product(productCode, productName, productDescription, productPrice, openDate, validityDate,
				expiryDate, active);
		return product;
	}

	public static void displayProductDetails(Product[] productList) {
		System.out.println("Product Code " + "	" + "Product Name " + "	" + "Product Description " + "	"
				+ "Product Price " + "	" + "Product Open Date " + "	" + "Product Validity Date " + "	"
				+ "Product Expiry Date " + "	" + "Product Active Status ");
		for( Product product : productList) {

		System.out.println(product.getProductCode() + "		" + product.getProductName() + "		"
				+ product.getProductDescription() + "			" + product.getProductPrice() + "		"
				+ product.getOpenDate() + "			" + product.getValidityDate() + "		" + product.getExpiryDate()
				+ "		" + product.isActive());
		}
	}

}
