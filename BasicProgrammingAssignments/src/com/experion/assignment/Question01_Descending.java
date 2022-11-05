package com.experion.assignment;

import java.util.Scanner;

public class Question01_Descending {

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
		System.out.println("Descending order is :");
		if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			if(secondNumber >= thirdNumber) 
				System.out.println(firstNumber +"	"+ secondNumber +"	"+ thirdNumber);
			else
				System.out.println(firstNumber +"	"+ thirdNumber +"	"+ secondNumber);
		}
		else if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			if(firstNumber >= thirdNumber)
				System.out.println(secondNumber +"	"+ firstNumber +"	"+ thirdNumber);
			else
				System.out.println(secondNumber +"	"+ thirdNumber +"	"+ firstNumber);
		}
		else {
			if(secondNumber >= firstNumber)
				System.out.println(thirdNumber +"	"+ secondNumber +"	"+ firstNumber);
			else
				System.out.println(thirdNumber +"	"+ firstNumber +"	"+ secondNumber);
		}
		
	}

}
