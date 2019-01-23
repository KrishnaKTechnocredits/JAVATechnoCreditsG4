package pallavi;

// WAP to swap two numbers using the third variable

public class Q_8 {

	static void swapNumber(int x, int y) {
		System.out.println("Before swapping numbers are " + x + " and " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping numbers are " + x + " and " + y);
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		swapNumber(num1, num2);
	}

}
