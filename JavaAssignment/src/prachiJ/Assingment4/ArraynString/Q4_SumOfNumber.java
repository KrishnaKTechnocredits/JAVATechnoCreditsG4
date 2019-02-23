package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q4_SumOfNumber {
	/*
	 * Description : This method is to find sum of user given number
	 * @param : Nothing
	 * @return : Nothing
	 */
	void sumOfNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		int rem = 0, sum = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			sum = sum + rem;
		}
		System.out.println("Sum of given number:- " + sum);
		scanner.close();
	}

	public static void main(String[] args) {
		Q4_SumOfNumber q4 = new Q4_SumOfNumber();
		q4.sumOfNum();
	}

}
