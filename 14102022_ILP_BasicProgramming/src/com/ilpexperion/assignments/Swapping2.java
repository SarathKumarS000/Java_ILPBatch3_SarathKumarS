package com.ilpexperion.assignments;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int firstValue;
		int secondValue;
		
		System.out.println("Enter first value : ");
		firstValue = scanner.nextInt();
		System.out.println("Enter second value : ");
		secondValue = scanner.nextInt();
		System.out.println("First value is : " + firstValue);
		System.out.println("Second value is : " + secondValue);
		System.out.println("After swapping");
		
		firstValue = firstValue + secondValue;
		secondValue = firstValue - secondValue;
		firstValue = firstValue - secondValue; 
		System.out.println("First value is " + firstValue);
		System.out.println("Second value is " + secondValue);
	}

}
