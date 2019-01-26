//to print sum, multiplication, subtraction,division and remainder of two number given by user 

package monika;

public class ArithmaticOperation {

	static void sum(int a, int b) {//sum of two number
		System.out.println("sum of two number is " + (a + b));
	}

	static void substraction(int a, int b) {//Subtraction of two number
		System.out.println("sum of two number is " + (a - b));
	}

	static void multiplication(int a, int b) {//multiplication of two number
		System.out.println("sum of two number is " + (a * b));
	}

	static void division(int a, int b) {//division of two number
		System.out.println("sum of two number is " + (a / b));
	}

	static void remainder(int a, int b) {//remainder of two number
		System.out.println("sum of two number is " + (a % b));
	}

	public static void main(String[] a) {
		int x = Integer.parseInt(a[0]);
		int y = Integer.parseInt(a[1]);
		sum(x, y);
		substraction(x, y);
		multiplication(x, y);
		division(x, y);
		remainder(x, y);
	}

}
