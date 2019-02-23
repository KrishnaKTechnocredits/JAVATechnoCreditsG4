package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q11_CheckForPallindromeNum {
	/*
	 * Description : This method is to find if the entered integer number is palindrome or not
	 * @param : num - user entered Number
	 * @return : Nothing
	 */
	void palindromeFind(int num) {
		int originalNum = num;
		int rem = 0, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == originalNum) {
			System.out.println(originalNum + " is a palindrome");
		} else {
			System.out.println(originalNum + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		Q11_CheckForPallindromeNum q11 = new Q11_CheckForPallindromeNum();
		q11.palindromeFind(num);
		scanner.close();
	}
}
