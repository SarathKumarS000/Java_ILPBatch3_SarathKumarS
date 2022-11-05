package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		String productNames[] = new String[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < productNames.length; i++) {
			System.out.println("Enter product " + (i + 1) + ":");
			productNames[i] = scanner.nextLine();
		}

		System.out.println("\nProducts are :");
		for (int i = 0; i < productNames.length; i++) {
			System.out.println("Product " + (i + 1) + " is " + productNames[i]);
		}
	}

}
