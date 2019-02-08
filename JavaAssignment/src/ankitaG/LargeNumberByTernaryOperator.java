package ankitaG;

import java.util.Scanner;

//Q3 from decision making and switch statement
public class LargeNumberByTernaryOperator {
	void findLargestNumber(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("largest number is " + max);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		LargeNumberByTernaryOperator largenum = new LargeNumberByTernaryOperator();
		largenum.findLargestNumber(num1, num2);
		scanner.close();
	}

}
