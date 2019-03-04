package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q3_CheckFreqOfChar {
	/*
	 * Description : This method is to enter a user defined String
	 * @param : Object of Scanner class
	 * @return : String - returns user entered String
	 */
	String inputString(Scanner scanner) {
		System.out.println("Enter a string: ");
		String s = scanner.nextLine();
		System.out.println("User String :-" + s);
		return s;
	}

	/*
	 * Description : This method is to enter a user defined character
	 * @param : Object of Scanner class
	 * @return : char - returns user entered char
	 */
	char inputChar(Scanner scanner) {
		System.out.println("Enter a char: ");
		char c = scanner.next().charAt(0);
		System.out.println("char value :- " + c);
		return c;
	}

	/*
	 * Description : This method is to find frequency of char(i.e, count no. of
	 * char in String)
	 * @param : s - passes user entered String
	 * @param : c - passes user entered char
	 * @return : Nothing
	 */
	void checkCharFreq(String s, char c) {
		int cnt = 0;
		for (int index = 0; index < s.length(); index++) {
			if (c == s.charAt(index)) {
				cnt++;
			}
		}
		System.out.println("Count of " + c + " :- " + cnt);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q3_CheckFreqOfChar q3 = new Q3_CheckFreqOfChar();
		String s = q3.inputString(scanner);
		char c = q3.inputChar(scanner);
		q3.checkCharFreq(s, c);
		scanner.close();
	}
}
