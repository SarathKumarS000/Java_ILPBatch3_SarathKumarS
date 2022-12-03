package com.experion.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.ProductService;
import com.experion.service.ProductServiceImpl;

public class ProductUtility {

	private static ProductService productService = new ProductServiceImpl();

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Save		2. List		3. Get     4. Delete");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			saveProduct();
			listAllProducts();
			break;
		case 2:
			listAllProducts();
			break;
		case 3:
			listAllProducts();
			getProduct();
			break;
		case 4:
			listAllProducts();
			deleteProduct();
			break;
		}

	}

	private static void saveProduct() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		System.out.println("Enter Product Code:");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name:");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description:");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Activation Date(yyyy-MM-dd):");
		String dateActivation = scanner.nextLine();
		Date activationDate = covertStringtoDate(dateActivation);
		System.out.println("Enter Product Expiry Date(yyyy-MM-dd):");
		String dateExpiry = scanner.nextLine();
		Date expiryDate = covertStringtoDate(dateExpiry);
		product = new Product(productCode, productName, productDescription, activationDate, expiryDate);
		productService.saveProduct(product);
	}

	private static Date covertStringtoDate(String date) throws ParseException { // To convert date in string format to
		// date format
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date covertedDate = formatter.parse(date);
		return covertedDate;
	}

	private static void listAllProducts() {
		List<Product> productList = productService.listAllProducts();
		System.out.println("Product Code" + " 	" + "Product Name");
		for (Product product : productList)
			System.out.println(product.getProductCode() + " 		" + product.getProductName());
	}

	private static void getProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code:");
		String productCode = scanner.nextLine();
		System.out.println(
				"Product Name" + " 	" + "Product Description" + " 	" + "Activation Date" + " 	" + "Expiry Date");
		productService.getProduct(productCode);
	}

	private static void deleteProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code:");
		String productCode = scanner.nextLine();
		productService.deleteProduct(productCode);
		listAllProducts();
	}
}
