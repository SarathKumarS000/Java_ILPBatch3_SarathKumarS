package com.experion.assignment;

import java.util.Scanner;

public class Question10_Pattern {

	public static void main(String[] args) {

		int number;
		int display=1;
		System.out.println("Enter a number :");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int index = 0; index < number; index++) {
			for (int j = 0; j <= index; j++) {
		        System.out.print( display++ + "		");
		      }
		      System.out.println();
		}
	}
}
