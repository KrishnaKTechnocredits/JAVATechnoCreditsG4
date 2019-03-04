package pallavi;

import java.util.Scanner;

public class Bank_Q2 
{
	Scanner sc;
	String account_no;
	String name;
	double totalAmount = 5000;

	double insertData() 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter account number given by customer");
		account_no = sc.next();
		System.out.println("Enter name given by customer");
		name = sc.next();
		System.out.println("Enter amount given by customer");
		totalAmount = sc.nextDouble();
		return totalAmount;
	}

	double deposit() 
	{
		System.out.println("Amount deposited by customer");
		double depositAmount = sc.nextDouble();
		totalAmount = depositAmount + totalAmount;
		System.out.println("After depositing " + depositAmount + " total amount in bank is " + totalAmount);
		return totalAmount;
	}

	double withdrawAmount() 
	{
		System.out.println("Amount withdrawn by customer");
		double withdrawAmount = sc.nextDouble();
		totalAmount = totalAmount - withdrawAmount;
		System.out.println("After withdrawing " + withdrawAmount + " total amount in bank is " + totalAmount);
		return totalAmount;
	}

	double checkBalance() 
	{
		System.out.println("Total amount in customers account is " + totalAmount);
		return totalAmount;
	}

	double displayDetails() 
	{
		System.out.println("Customer name is " + name + "whose account number is " + account_no
				+ " and total balance is " + totalAmount);
		return totalAmount;
	}

	void menuOfBank() 
	{
		System.out.println("Press key from given menu");
		sc = new Scanner(System.in);
		int menu = sc.nextInt();
		switch (menu) 
		{
		case 0:
			System.out.println(displayDetails());
			break;

		case 1:
			System.out.println(insertData());
			break;

		case 2:
			System.out.println(deposit());
			break;

		case 3:
			System.out.println(withdrawAmount());
			break;

		case 4:
			System.out.println(checkBalance());
			break;

		case 5:
			System.out.println(deposit());
			System.out.println(checkBalance());
			break;

		case 6:
			System.out.println(withdrawAmount());
			System.out.println(checkBalance());
			break;

		case 7:
			System.out.println(deposit());
			System.out.println(withdrawAmount());
			System.out.println(checkBalance());
			break;

		default:
			break;
		}
	}
}
