package com.experion.assignment;

import java.util.Scanner;

public class Question11_CountFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in array :");
		int number = scanner.nextInt();
		int[] array = new int[number];
		System.out.println("Enter the elements");
		for (int index = 0; index < number; index++) {
			// reading array elements from the user
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter the element to find the total occurance : ");
		int element = scanner.nextInt();
		int frquency = 0;
		for(int index = 0; index < array.length; index++) 
		{
			if(array[index] == element)
			{
				frquency++;
			}
		}
		
		System.out.println(element + " Occurred " + frquency + " Times.");

	}
}
