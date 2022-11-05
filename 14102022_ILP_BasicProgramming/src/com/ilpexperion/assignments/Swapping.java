package com.ilpexperion.assignments;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int firstValue;
		int secondValue;
		int tempValue;
		
		System.out.println("Enter first value : ");
		firstValue = scanner.nextInt();
		System.out.println("Enter second value : ");
		secondValue = scanner.nextInt();
		System.out.println("First value is : " + firstValue);
		System.out.println("Second value is : " + secondValue);
		System.out.println("After swapping");
		tempValue = firstValue;
		firstValue = secondValue;
		secondValue = tempValue;
		System.out.println("First value is " + firstValue);
		System.out.println("Second value is " + secondValue);
	}

}
