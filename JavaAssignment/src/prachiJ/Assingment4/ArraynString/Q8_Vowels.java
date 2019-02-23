package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q8_Vowels {
	/*
	 * Description : This method is to find vowels in user entered String
	 * @param : user entered String
	 * @return : nothing
	 */
	void vowelsFind(String str) {
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			int val = str.charAt(index);
			if (val == 65 || val == 69 || val == 73 || val == 79 || val == 85 || val == 97 || val == 101 || val == 105
					|| val == 111 || val == 117) {
				// System.out.println((char)(val) + " is a vowel");
				cnt++;
			}
		}
		System.out.println("Vowels Count: " + cnt);
	}

	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Q8_Vowels q8 = new Q8_Vowels();
		q8.vowelsFind(str);
		scanner.close();
	}
}
