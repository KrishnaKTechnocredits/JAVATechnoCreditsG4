package prachiJ.Assingment4.ArraynString;

import java.util.Scanner;

public class Q9_AverageOfNumbers {
	/*
	 * Description : This method takes few integer numbers from user
	 * @param : Object of Scanner class
	 * @return : Nothing
	 */
	int[] takeInputFromUserInt(Scanner scanner) {
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter few random numbers in an array: ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = scanner.nextInt();
		}
		System.out.println("Numbers entered are: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + "\t");
		}
		System.out.println("\n");
		return arr;
	}

	/*
	 * Description : This method is to calculate average of given numbers
	 * @param : arr - passes array of user entered numbers
	 * @Return : Nothing
	 */
	void computeAverage(int[] arr) {
		int sum = 0;
		float avg;
		for (int index = 0; index < arr.length; index++) {
			sum = arr[index] + sum;
		}
		avg = (float) sum / arr.length;
		System.out.println("Average is " + avg);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q9_AverageOfNumbers q9 = new Q9_AverageOfNumbers();
		int[] arr = q9.takeInputFromUserInt(scanner);
		q9.computeAverage(arr);
		scanner.close();
	}
}
