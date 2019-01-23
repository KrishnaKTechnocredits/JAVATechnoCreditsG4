package pallavi;

//WAP to swap two numbers without using the third variable

public class Q_9 {

	static void swap(int num1, int num2) {
		System.out.println("Before swapping numbers are " + num1 + " " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swaping numbers are: " + num1 + " " + num2);
	}

	public static void main(String[] args) {

		int firstnum = Integer.parseInt(args[0]);
		int secondnum = Integer.parseInt(args[1]);
		swap(firstnum, secondnum);
	}
}
