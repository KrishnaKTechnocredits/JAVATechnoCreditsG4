package ankitaG;

import java.util.Scanner;

//Q6 from class and object section---this class takes different types of inputs from user and perform addition.
public class Addition {
	// method to add two integer values
	void add(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println("addition is " + num3);
	}

	// method to add two float values
	void add(float num1, float num2) {
		float num3 = num1 + num2;
		System.out.println("addition is " + num3);

	}

	// method to add two string values
	void add(String num1, String num2) {
		String num3 = num1 + num2;
		System.out.println("addition is " + num3);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Addition add = new Addition();
		System.out.println("enter two whole numbers for addition");
		add.add(scanner.nextInt(), scanner.nextInt());
		System.out.println("enter two decimal numbers for addition");
		add.add(scanner.nextFloat(), scanner.nextFloat());
		System.out.println("enter any two values for addition");
		add.add(scanner.next(), scanner.next());
		scanner.close();
	}

}
