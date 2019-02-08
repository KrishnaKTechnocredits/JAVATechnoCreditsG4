package pallavi;

import java.util.Scanner;

public class Addition_Q6 
{
	Scanner sc;

	void addTwoIntegers() 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter first integer number");
		int num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		int num2 = sc.nextInt();
		System.out.println("Addition of two integer numbers is :" + (num1 + num2));
	}

	void addTwoDecimal() 
	{
		System.out.println("Enter first decimal number");
		double num1 = sc.nextDouble();
		System.out.println("Enter second decimal number");
		double num2 = sc.nextDouble();
		System.out.println("Addition of two decimal numbers is :" + (num1 + num2));
	}

	void addTwoString() 
	{
		System.out.println("Enter first string");
		String firstString = sc.next();
		System.out.println("Enter second string");
		String secondString = sc.next();
		System.out.println("Addition of two strings is :" + (firstString +" "+ secondString));
	}

	public static void main(String[] args) 
	{
		Addition_Q6 addition = new Addition_Q6();
		addition.addTwoIntegers();
		addition.addTwoDecimal();
		addition.addTwoString();
	}
}
