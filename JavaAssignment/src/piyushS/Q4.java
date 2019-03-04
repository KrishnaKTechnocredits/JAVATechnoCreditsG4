package piyushS;

import java.util.Scanner;

public class Q4 {

	static int firstNumber;
	static int secondNumber;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int secondNumber = scan.nextInt();
		System.out.println("Enter the required Operation");
		int operation = scan.nextInt();

		switch (operation) {
		case 1:
			int addition = firstNumber + secondNumber;
			System.out.println("Addition of two nos is " + addition);
			break;

		case 2:
			int Subtraction = firstNumber - secondNumber;
			System.out.println("Subtraction of two nos is " + Subtraction);
			break;
			
		case 3:
			int Division = firstNumber/secondNumber;
			System.out.println("Division of two nos is " + Division);
			break;
			
		case 4:
			int Multiplication = firstNumber*secondNumber;
			System.out.println("Multiplication of two nos is " + Multiplication);
			break;
			
		}
	}

}
