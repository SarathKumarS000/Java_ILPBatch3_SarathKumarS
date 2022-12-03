package com.experion.service;

import com.experion.entity.Customer;

public class CustomerService {

	public static Customer[] createCustomerList() {
		Customer[] customerArray = new Customer[3];
		customerArray[0] = new Customer("CUS100", "Suneesh", "Gold");
		customerArray[1] = new Customer("CUS101", "Sarath", "Silver");
		return customerArray;
	}
	
	public static void displayCustomerArray(Customer[] customerArray) {
		try {

			System.out.println(customerArray[3]);
			System.out.println("Completed");
		}
		catch (NullPointerException ex){
			System.out.println(ex.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		}
		catch (ArithmeticException ex){
			System.out.println("Division cannot be done with zero");
		}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Completed Saving Data");
		}
	}
}
