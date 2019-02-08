package piyushS;

import java.util.Scanner;

public class Q2 {

	static String number;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int secondNumber = scan.nextInt();

		number = (firstNumber > secondNumber) ? "FirstNumber" : "SecondNumber";
		System.out.println(number + " is larger");
	}

}
