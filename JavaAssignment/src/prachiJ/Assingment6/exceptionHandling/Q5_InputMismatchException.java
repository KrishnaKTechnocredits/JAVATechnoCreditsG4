package prachiJ.Assingment6.exceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

//A Class that represents InputMismatchException
public class Q5_InputMismatchException {

	void operationsOnNumbers() {
		System.out.println("Enter count of numbers to be entered:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter numbers between 1-100: ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 1;
		int num;
		float avg;
		int sum = 0;
		try {
			while (i <= n) {
				num = scanner.nextInt(); // Expected input is only int values
				al.add(num);
				i++;
			}
			System.out.println("Numbers entered are: " + al);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Please enter numbers only");
			e.printStackTrace();
		}

		for (int index = 0; index < n; index++) {
			sum = sum + al.get(index); // gives sum
		}
		System.out.println("Sum is : " + sum);
		avg = (float) sum / n; // gives average
		System.out.println("Average is : " + avg);
		scanner.nextInt();
		System.out.println("Enter QUIT to stop");
	}

	public static void main(String[] args) {
		Q5_InputMismatchException q5 = new Q5_InputMismatchException();
		q5.operationsOnNumbers();
	}
}
