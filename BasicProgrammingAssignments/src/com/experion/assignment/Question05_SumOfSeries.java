package com.experion.assignment;

import java.util.Scanner;

public class Question05_SumOfSeries {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value :");
        int number = scanner.nextInt();
        int digit = 1;
        int power = 1;
        double seriesSum = 0;
        for (int count = 1; count <= number; count++) {
            if (power % 2 == 0)
                seriesSum = seriesSum - Math.pow(digit, count);
            else
                seriesSum = seriesSum + Math.pow(digit, count);
            digit += 2;
            power += 1;



       }
        System.out.println("Sum of series is " + seriesSum);

	}

}
