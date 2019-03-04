package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q13_ArmstrongFind {
	/*
	 * Description : This method is to find is the user entered number is Armstrong or not
	 * @param : num - user entered number
	 * @return : nothing
	 */
	void armstrongFind(int num) {
		int originalNum = num;
		int digits = 0;
		int rem = 0;
		int sum = 0;
		while (num != 0) {
			num = num / 10;
			digits++;
		}
		num = originalNum;
		while (num != 0) {
			rem = num % 10;
			int result = 1;
			for (int i = 1; i <= digits; i++) {
				result = rem * result;
			}
			sum = result + sum;
			num = num / 10;
		}
		if (sum == originalNum) {
			System.out.println(originalNum + " is Armstrong");
		} else {
			System.out.println(originalNum + " is not Armstrong");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Q13_ArmstrongFind q13 = new Q13_ArmstrongFind();
		q13.armstrongFind(num);
		scanner.close();
	}
}
