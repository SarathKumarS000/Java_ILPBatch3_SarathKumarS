package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class BankUtility {

	public static void main(String[] args) {

		/*
		 * Account account = new Account("Womens Savings Account", "ACC10001", 1000);
		 * AccountService accountService = new AccountService();
		 * accountService.depositCash(account, 100000);
		 * accountService.depositCash(account, 100000, "sarath@oksbi");
		 * accountService.depositCash(account, "CHQ1234", 200000);
		 */

		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Account 2. Card 3. Loan");
		int choice = scanner.nextInt();
		if (choice == 1) {
			product = new Account("Womens Savings Account", "ACC10001", 1000);
		} else if (choice == 2) {
			product = new Card("Master card", "CARD1234", 100000);
		} else if (choice == 3) {
			product = new Loan("Home loan", "LOAN1234", 1000000);
		}
		product.checkProductValidity();
	}
}
