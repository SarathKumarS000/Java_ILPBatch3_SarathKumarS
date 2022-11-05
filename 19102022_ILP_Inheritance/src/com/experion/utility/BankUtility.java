package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class BankUtility {

	public static void main(String[] args) {

		char mainChoice;
		ArrayList<Product> productList = new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. Add Card Products	2. Add Account Products	3. Buy Product");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				productList.add(Service.createProduct("Cards"));
				break;
			case 2:
				productList.add(Service.createProduct("Accounts"));
				break;
			case 3:
				Service.displayProductDetails(productList);
				break;
			default:
				System.out.println("Invalid  choice");
			}
			System.out.println("Do you want to continue (y/n):");
			mainChoice = scanner.next().charAt(0);
		} while (mainChoice == 'y');
	}

}
