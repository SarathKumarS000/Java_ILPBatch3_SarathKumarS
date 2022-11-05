package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		char mainChoice, cusChoice = 'n';
		int customerChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		do {
			System.out.println("1. Create Product  2. Display Product");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				productList.add(Service.createProduct());
				break;
			case 2:
				Service.displayProductDetails(productList);
			}
			System.out.println("Do you want to continue (y/n):");
			mainChoice = scanner.next().charAt(0);
			while (cusChoice == 'y' || mainChoice == 'n') {
				System.out.println("Customer choice (Please Enter the serial no.): ");
				customerChoice = scanner.nextInt();
				Date currentDate = new Date();
				Service.customerProduct(customerChoice, productList, currentDate);
				System.out.println("Select another product (y/n):");
				cusChoice = scanner.next().charAt(0);
				if (cusChoice == 'n')
					mainChoice = 'y';
			}
			;

		} while (mainChoice == 'y');

	}

}
