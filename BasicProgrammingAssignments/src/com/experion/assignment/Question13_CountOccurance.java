package com.experion.assignment;

import java.util.Scanner;

public class Question13_CountOccurance {

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
		//Sorting the array
		for (int index = 0; index < number - 1; index++) {
			int countOfSwap = 0;
			for (int j = 0; j < number - 1 - index; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					countOfSwap++;
				}
			}
			if (countOfSwap == 0)
				break;
		}
		//Counting occurrence of each elements
		for (int index = 0; index < number; index++) {
			int count = 1;
			while (index < number - 1 && array[index] == array[index + 1]) {
				index++;
				count++;
			}
			System.out.println("Occurance of " + array[index] + "is " + count + "times");
			count++;
		}

	}

}
