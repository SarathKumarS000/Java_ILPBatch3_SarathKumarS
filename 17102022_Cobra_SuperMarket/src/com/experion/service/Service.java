package com.experion.service;

import com.experion.entity.Product;

import java.util.Scanner;

public class Service {
	int count = 0;

	static Product productList[] = new Product[3];

	public void StockUpdation() {
		int i = 0;
		// product.setProductCode(productCode);
		Scanner scanner = new Scanner(System.in);

		// product.setProductName(productName);

		// product.setProductPrice(productPrice);

		char productAdd = 'y';
		do {
			scanner.nextLine();
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Product Price : ");
			double productPrice = scanner.nextDouble();

			productList[i] = new Product(productCode, productName, productPrice);
			i++;

			System.out.println("Do you want to continue (y/n):");
			productAdd = scanner.next().charAt(0);
			count++;
		} while (productAdd == 'y');
	}

	public void StockDisplay() {
		int i = 0;
		do {
			System.out.println("Product Code " + "	" + "Product Name " + "	" + "Product Price ");
			System.out.println(productList[i].getProductCode() + "		" + productList[i].getProductName() + "		"
					+ productList[i].getProductPrice());
			i++;
		} while (i < count);

	}

}
