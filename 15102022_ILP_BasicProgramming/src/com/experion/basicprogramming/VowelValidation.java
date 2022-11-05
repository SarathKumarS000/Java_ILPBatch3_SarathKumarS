package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {

		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character :");
		ch = scanner.next().charAt(0);
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' : 
		case 'E' :
		case 'I' : 
		case 'O' : 
		case 'U' : System.out.println("Vowel");
					break;
		  
		default : System.out.println("Not a vowel");
		}
	}

}
