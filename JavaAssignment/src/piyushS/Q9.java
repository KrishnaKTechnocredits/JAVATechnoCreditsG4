package piyushS;

public class Q9 {

	static void swapping(int number1, int number2) {
		System.out.println("Numbers before are " + number1 + " " + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Numbers after are: " + number1 + " " + number2);
	}

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		swapping(num1, num2);
	}
}
