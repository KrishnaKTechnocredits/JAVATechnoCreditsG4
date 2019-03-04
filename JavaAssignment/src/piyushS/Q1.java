package piyushS;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int secondNumber = scan.nextInt();
		System.out.println("Enter 3rd Number");
		int thirdNumber = scan.nextInt();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " is the largest number");
		}

		else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is the largest number");
		}

		else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			System.out.println(thirdNumber + " is the largest number");
		}

	}

}
