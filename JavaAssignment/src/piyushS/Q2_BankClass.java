package piyushS;

import java.util.Scanner;

public class Q2_BankClass {

	Scanner scan = new Scanner(System.in);

	String account_no;
	String name;
	static int totalamount = 1000000;

	void insertData() {
		System.out.println("Enter name of a Customer");
		String name = scan.next();
		System.out.println("Enter account number of a Customer");
		String account_no = scan.next();
		System.out.println("Name of a customer is " + name + ", his/her account number is " + account_no+ " and is total balance is Rs. "+totalamount);

	}

	void deposit() {
		System.out.println("Enter amount you want to deposit");
		int dep = scan.nextInt();
		totalamount = totalamount + dep;
		System.out.println("Total amount after depositing Rs. " + dep + " is " + totalamount);
	}

	void depositAndBalance() {
		System.out.println("Enter amount you want to deposit");
		int dep = scan.nextInt();
		totalamount = totalamount + dep;
		System.out.println("Total amount after depositing Rs. " + dep + " is " + totalamount);
		int balance = totalamount;
		System.out.println("Total balance is Rs. " + balance);

	}

	void withdrawal() {
		System.out.println("Enter amount you want to withdrawal");
		int with = scan.nextInt();
		totalamount = totalamount - with;
		System.out.println("Total amount after withdrawling Rs. " + with + " is " + totalamount);
	}

	void withdrawalAndBalance() {
		System.out.println("Enter amount you want to withdrawal");
		int with = scan.nextInt();
		totalamount = totalamount - with;
		System.out.println("Total amount after withdrawling Rs. " + with + " is " + totalamount);
		int balance = totalamount;
		System.out.println("Total balance is Rs. " + balance);

	}

	void checkBalance() {
		int balance = totalamount;
		System.out.println("Total balance is " + balance);
	}

	void displayDetails() {
		System.out.println("Insert the operation which needs to be performed for a Customer");
		String menu = scan.next();

		switch (menu) {

		case "insertData":
			insertData();
			break;

		case "deposit":
			deposit();
			break;

		case "withdrawal":
			withdrawal();
			break;

		case "checkBalance":
			checkBalance();
			break;

		case "depositAndBalance":
			depositAndBalance();
			break;

		case "withdrawalAndBalance":
			withdrawalAndBalance();
			break;
		}

	}
}