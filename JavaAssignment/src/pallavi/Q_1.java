package pallavi;

// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers given by user

public class Q_1 {

	int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	int multiplication(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}

	int substraction(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	int remainder(int num1, int num2) {
		int rem = num1 % num2;
		return rem;
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		Q_1 q = new Q_1();
		int sum = q.addition(num1, num2);
		int mul = q.multiplication(num1, num2);
		int sub = q.substraction(num1, num2);
		int div = q.division(num1, num2);
		int rem = q.remainder(num1, num2);
		System.out.println(" Sum is:" + sum + ",Substraction is:" + sub + ",Multiplication is:" + mul + ",Division is:"
				+ div + " and Remainder is:" + rem);

	}
}
