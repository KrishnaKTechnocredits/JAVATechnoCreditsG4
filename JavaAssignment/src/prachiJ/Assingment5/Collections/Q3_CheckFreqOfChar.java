package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q3_CheckFreqOfChar {

	public static void main(String[] args) {

		Q3_CheckFreqOfChar checkFreqOfChar = new Q3_CheckFreqOfChar();
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> al = checkFreqOfChar.inputString(scanner);
		char c = checkFreqOfChar.inputChar(scanner);
		checkFreqOfChar.checkCharFreq(al, c);
		scanner.close();
	}

	/*
	 * Description : This method is to enter a user defined String
	 * @param : Object of Scanner class
	 * @return : ArrayList<String> - returns user entered String
	 */
	ArrayList<String> inputString(Scanner scanner) {
		System.out.println("Enter a string: ");
		String s = scanner.nextLine();
		System.out.println("User String :- " + s);
		ArrayList<String> al = new ArrayList<String>();
		al.add(s);
		return al;
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
	 * Description : This method is to find frequency of char(i.e, count no. of char in String)
	 * @param : al - passes user entered String
	 * @param : c - passes user entered char
	 * @return : Nothing
	 */
	void checkCharFreq(ArrayList<String> al, char c) {
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		int length = al.get(0).length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (lhm.containsKey(al.get(0).charAt(i))) {
				lhm.put(al.get(0).charAt(i), lhm.get(al.get(0).charAt(i)) + 1);
			} else {
				lhm.put(al.get(0).charAt(i), 1);
			}

			if (al.get(0).charAt(i) == c) {
				count = lhm.get(al.get(0).charAt(i));
			}
		}
		// System.out.println(lhm);
		System.out.println("count of " + c + " :- " + count);

	}
}
