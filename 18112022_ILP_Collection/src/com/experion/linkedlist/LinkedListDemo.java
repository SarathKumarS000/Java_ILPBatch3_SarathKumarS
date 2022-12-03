package com.experion.linkedlist;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo{

	public static void main(String[] args) {

		List <String> numberList = new LinkedList<String>();
		numberList.add("Hello");
		numberList.add(1, "Sarath");
		
		System.out.println(numberList);

	}

}
