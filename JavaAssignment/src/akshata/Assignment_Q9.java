package akshata;

public class Assignment_Q9 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		swap(num1, num2);

	}

	static void swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("The numbers after swapping are " + num1 + " & " + num2);
	}
}
