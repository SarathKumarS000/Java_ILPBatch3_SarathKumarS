package com.experion.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.experion.entity.Customer;

public class CustomerUtility {

	public static void main(String[] args) {

		Customer customer = new Customer("CUS100", "Suneesh");
		
		//Serialization
		try
		{
			FileOutputStream fos = new FileOutputStream("D:\\Serialization\\customer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(customer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//Deserialization
		try
		{
			FileInputStream fis = new FileInputStream("D:\\Serialization\\customer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Customer dCustomer = (Customer)ois.readObject();
			
			System.out.println(dCustomer.getCustomerCode());
			System.out.println(dCustomer.getCustomerName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
