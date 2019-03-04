package piyushS;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = scan.nextInt();

		if (marks > 0 && marks < 50) {
			System.out.println("Student is Failed");
		}

		else if (marks >= 50 && marks < 75) {
			System.out.println("Student got First Class");
		}

		else if (marks >= 75 && marks < 100) {
			System.out.println("Student Passed with Distinction");
		}

	}

}
