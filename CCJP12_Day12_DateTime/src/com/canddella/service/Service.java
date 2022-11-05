package com.canddella.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.canddella.entity.Product;

public class Service {

	public static void inputProductDetails() throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name : - ");
		String productName = scanner.nextLine();
		System.out.println("Enter open date  : - ");
		String openDate = scanner.nextLine();
		Date dateOpen = covertStringtoDate(openDate);
		System.out.println("Enter validity date : - ");
		String validityDate = scanner.nextLine();
		Date dateValidity = covertStringtoDate(validityDate);
		System.out.println("Enter expiry date : - ");
		String expiryDate = scanner.nextLine();
		Date dateExpiry = covertStringtoDate(expiryDate);
		Product product = new Product(productName,dateOpen,dateValidity,dateExpiry);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(dateFormat.format(product.getOpenDate()) + "    "
				+ dateFormat.format(product.getValidityDate()) + "   " + dateFormat.format(product.getExpiryDate()));
		System.out.println(product.getOpenDate().before(product.getValidityDate()));
	}
	public static Date covertStringtoDate(String date) throws ParseException
	{
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date covertedDate = formatter.parse(date);
		return covertedDate;
	}

}
