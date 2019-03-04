package monika;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of Array");
		int[] number = new int[size];
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("The entered numbers are");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		DuplicateNumber obj = new DuplicateNumber();
		obj.findDuplicateNumber(number);

	}

	void findDuplicateNumber(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count = count + 1;
					if (count == 1)
						System.out.println(num[i] + " is a duplicate number");

				}
			}

		}
	}
}
