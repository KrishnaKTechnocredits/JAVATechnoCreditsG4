package ankitaG;

import java.util.Scanner;

//Q1 from decision making and switch statement
public class LargestNumber {

	void findLargestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("largest number is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("largest number is " + num2);
		} else {
			System.out.println("largest number is " + num3);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		LargestNumber largenum = new LargestNumber();
		largenum.findLargestNumber(num1, num2, num3);
		scanner.close();
	}

}
