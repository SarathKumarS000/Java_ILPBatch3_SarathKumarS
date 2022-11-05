package com.ilpexperion.assignments;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number : ");
		secondNumber = scanner.nextInt();
		System.out.println("Enter third number : ");
		thirdNumber = scanner.nextInt();
		
		if((firstNumber < secondNumber) && (secondNumber < thirdNumber) || (firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
			System.out.println(secondNumber + " is the second smallest number");
		}
		else if((firstNumber > secondNumber) && (firstNumber < thirdNumber) || (firstNumber < secondNumber) && (firstNumber > thirdNumber)) {
			System.out.println(firstNumber + " is the second smallest number");
		}
		else {
			System.out.println(thirdNumber + " is the second smallest number");
		}

	}

}
