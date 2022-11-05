package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		char mainChoice = 'y';
		Product product = null;
		Product selectedProduct = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("********Welcome to Login Page********");
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customer = null;
		do {
			System.out.println("\n1. Manager		2. Customer");
			int user = scanner.nextInt();
			switch (user) {
			case 1:
				char add = 'y';
				do {
					System.out.println("\n1. Create Fabric Product	2. Create Electronic Product");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						productList.add(Service.createProduct("Fabrics"));
						break;

					case 2:
						productList.add(Service.createProduct("Electronics"));
						break;
					}
					System.out.println("\nDo you want to add more products (y/n) :");
					add = scanner.next().charAt(0);
				} while (add == 'y');
				break;
			case 2:
				char cont = 'y';
				char buy = 'y';
				char service = 'y';
				do {
					System.out.println("\n1.Buy Product	2. Product Services");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						do {
							scanner.nextLine();
							System.out.println("\nEnter Customer Code : ");
							String customerCode = scanner.nextLine();
							selectedProduct = Service.buyProduct(productList, customerList, customerCode);
							if (selectedProduct != null) {
								System.out.println("\nEnter Customer Name : ");
								String customerName = scanner.nextLine();
								customerList.add(customer = new Customer(customerCode, customerName, selectedProduct));
								System.out.println("\nDo you want to buy more products (y/n):");
								buy = scanner.next().charAt(0);
							} else
								buy = 'n';
						} while (buy == 'y');
						break;
					case 2:
						do {
							Date currentDate = new Date(); //Creating current date
							Service.getProductService(currentDate, customerList);
							System.out.println("\nDo you have more products for service (y/n):");
							service = scanner.next().charAt(0);
						} while (service == 'y');
					}
					System.out.println("\nGo back to customer page (y/n)?");
					cont = scanner.next().charAt(0);
				} while (cont == 'y');
			}
			System.out.println("\nGo back to login page (y/n):");
			mainChoice = scanner.next().charAt(0);
			System.out.println("\n----------------------------------------");
		} while (mainChoice == 'y');
	}
}
