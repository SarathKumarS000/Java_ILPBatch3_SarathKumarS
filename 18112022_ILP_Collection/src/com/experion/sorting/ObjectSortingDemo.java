package com.experion.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSortingDemo {

	public static void main(String[] args) {



		List<String> customerList = new ArrayList<>();
		customerList.add("Sarath");
		customerList.add("Suneesh");
		customerList.add("Rahul");
		customerList.add("Vivin");
		customerList.add("Sreeni");
		Collections.sort(customerList);
		System.out.println(customerList);
		

	}

}
