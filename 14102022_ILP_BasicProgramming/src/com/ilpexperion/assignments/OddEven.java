package com.ilpexperion.assignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int value;
		int lastDigit;

		System.out.println("Enter value : ");
		value = scanner.nextInt();
		
		lastDigit = value % 10;
		if (lastDigit == 0) { 
			System.out.println("Value is zero.");
		}
		else if (lastDigit % 2 == 0) {
			System.out.println("Value is even.");
		} 
		else {
			System.out.println("Value is odd.");
		}
	}

}
