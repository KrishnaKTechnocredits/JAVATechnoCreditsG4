package monika;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		int actualsum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int size = sc.nextInt();
		System.out.println("Enter the values of array");
		int[] value = new int[size - 1];
		for (int i = 0; i < value.length; i++) {
			value[i] = sc.nextInt();
			actualsum = actualsum + value[i];
		}
		System.out.println("Entered numbers are :");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		// System.out.println("Actual sum is "+actualsum);
		int expectedsum = size * (size + 1) / 2;
		// System.out.println("Expected sum is "+expectedsum);
		int missingnum = expectedsum - actualsum;
		System.out.println("Missing number is " + missingnum);
		sc.close();
	}

}
