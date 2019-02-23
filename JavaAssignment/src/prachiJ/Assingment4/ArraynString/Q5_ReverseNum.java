package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q5_ReverseNum {
	/*
	 * Description: This method is to reverse user given number
	 * @param : Nothing
	 * @return : Nothing
	 */
	void reverseOfNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		int rem = 0, rev = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			rev = (rev * 10) + rem;
		}
		System.out.println("Reverse of given number:- " + rev);
		scanner.close();
	}

	public static void main(String[] args) {
		Q5_ReverseNum q5 = new Q5_ReverseNum();
		q5.reverseOfNum();
	}
}
