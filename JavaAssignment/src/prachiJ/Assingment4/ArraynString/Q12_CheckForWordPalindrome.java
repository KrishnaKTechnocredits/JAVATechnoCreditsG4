package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q12_CheckForWordPalindrome {
	/*
	 * Description : This method is to find if the entered word is palindrome or not
	 * @param : str - user entered word
	 * @return : Nothing
	 */
	void palindromeFind(String str) {
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			rev = rev + str.charAt(index);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(rev + " is a palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		Q12_CheckForWordPalindrome q12 = new Q12_CheckForWordPalindrome();
		q12.palindromeFind(str);
	}

}
