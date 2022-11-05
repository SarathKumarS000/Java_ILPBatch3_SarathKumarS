package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100", "Online Banking"));
		bankServices.add(new BankServices("SMB200", "Mobile Banking"));
		bankServices.add(new BankServices("SCB300", "Cash Deposit"));
		Scanner scanner = new Scanner(System.in);
		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Card Type : ");
			String cardType = scanner.nextLine();
			product = new Card(productCode, productName, productType, cardType);
		} else if (productType.compareTo("Accounts") == 0) {
			System.out.println("Enter Product Code : ");
			String productCode = scanner.nextLine();
			System.out.println("Enter Product Name : ");
			String productName = scanner.nextLine();
			System.out.println("Enter Account Type : ");
			String accountType = scanner.nextLine();
			product = new Account(productCode, productName, productType, accountType, bankServices);
		}
		return product;
	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		Card card = null;
		Account account = null;
		System.out.println("Product Code" + "	" + "Product Name" + "	" + "Product Type" + "	" + "Card or Account"
				+ "	" + "Services");

		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product;
				System.out
						.println(card.getProductCode() + "	" + card.getProductName() + "	" + card.getProductType()
								+ "	" + card.getCardType());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(
						account.getProductCode() + "	" + account.getProductName() + "	" + account.getProductType()
								+ "	" + account.getAccountType() + "	" + account.getBankServices());
				System.out.println("The list of services are given below ");
				for(BankServices bankServices : account.getBankServices()) {
					System.out.println(bankServices.getServiceName());
				}
			}
		}
	}

}
