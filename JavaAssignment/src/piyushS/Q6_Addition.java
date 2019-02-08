package piyushS;

import java.util.Scanner;

public class Q6_Addition {

	void add(int number1, int number2) {
		System.out.println("Addition of two Integers is " + (number1 + number2));

	}

	void add(String number1, String number2) {
		System.out.println("Addition of two Strings is " + (number1 + " " + number2));

	}

	void add(double number1, double number2) {
		System.out.println("Addition of two Double numbers is " + (number1 + number2));

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Q6_Addition object = new Q6_Addition();
		
		System.out.println("Enter two integers");
		object.add(scan.nextInt(), scan.nextInt());
		
		System.out.println("Enter two strings");
		object.add(scan.next(), scan.next());
		
		System.out.println("Enter two double numbers");
		object.add(scan.nextDouble(), scan.nextDouble());

	}

}
