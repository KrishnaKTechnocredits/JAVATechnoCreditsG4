package piyushS;

import java.util.Scanner;

public class Q4_TestSquare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of the Sqaure");
		Q4_Square square = new Q4_Square(scan.nextInt());
		square.areaOfSquare();
	}
}
