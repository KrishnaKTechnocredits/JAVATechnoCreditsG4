package pallavi;

// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers given by user

public class Q_1 {

	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers is " + sum);
	}

	void multiplication(int a, int b) {
		int mul = a * b;
		System.out.println("Multiplication of two numbers is " + mul);
	}

	void division(int a, int b) {
		int div = a / b;
		System.out.println("Division of two numbers is " + div);
	}

	void remainder(int a, int b) {
		int rem = a % b;
		System.out.println("Remainder of two numbers is " + rem);
	}

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Q_1 q = new Q_1();
		q.addition(x, y);
		q.multiplication(x, y);
		q.division(y, x);
		q.remainder(x, y);
	}
}
