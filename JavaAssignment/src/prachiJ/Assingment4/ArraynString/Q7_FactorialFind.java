package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q7_FactorialFind {
	/*
	 * Description : This method is to find Factorial of a number
	 * @param : n - user entered number to find factorial
	 * @return : factorial of a number entered
	 */
	int factorialFind(int n) {
		int fact = 1;
		while (n != 0) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		Q7_FactorialFind q7 = new Q7_FactorialFind();
		int fact = q7.factorialFind(n);
		System.out.println("Factorial of " + n + " is " + fact);
		scanner.close();
	}
}
