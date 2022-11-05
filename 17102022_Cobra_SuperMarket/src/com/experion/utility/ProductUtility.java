package com.experion.utility;

import java.util.Scanner;

import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		int choice;
		Service service = new Service();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Select option	1. Stock Update	 2. Stock Display");
			choice = scanner.nextInt();
			if (choice == 1) {
				service.StockUpdation();
			} else if (choice == 2) {
				service.StockDisplay();
				break;
			} else {
				System.out.println("Invalid Choice");
				break;
			}
		}

	}
}
