package piyushS;

public class Q8 {

	static void swapNumber(int number1, int number2	) {
		System.out.println("Numbers before are " + number1 + " and " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Numbers after are " + number1 + " and " + number2);
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		swapNumber(num1, num2);
	}

}
