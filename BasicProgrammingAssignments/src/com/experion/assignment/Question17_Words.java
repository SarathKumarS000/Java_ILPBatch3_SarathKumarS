package com.experion.assignment;

import java.util.Scanner;

public class Question17_Words {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter a Sentence : ");
        String sentence = scanner.nextLine();
        int count = 1;
        for(int i=0; i<=sentence.length()-1; i++){
            if(sentence.charAt(i) == ' ' && sentence.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.print("Total number of words are " + count);
	}
}
