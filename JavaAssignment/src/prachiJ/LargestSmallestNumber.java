package prachiJ;

import java.util.Scanner;

//To find largest and smallest number is unsorted array
public class LargestSmallestNumber {
	/*
	 * Description: This method is to input random values in array
	 * @param scanner for passing object of Scanner class
	 * @return Nothing
	 */
	int[] takeInputFromUserInt(Scanner scanner) {
		System.out.println("Enter size of array: ");
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
	 * Description: To find Largest and Smallest in unsorted array
	 * @param arr for passing array
	 * @return Nothing
	 */
	void findLargestSmallestNum(int[] arr) {
		int smallest = arr[0], largest = arr[0];
		for (int index = 0; index < arr.length - 1; index++) {
			if (largest < arr[index + 1]) {
				largest = arr[index + 1];
			}
			if (smallest > arr[index + 1]) {
				smallest = arr[index + 1];
			}
		}
		System.out.println("Largest Number is: " + largest);
		System.out.println("Smallest Number is: " + smallest);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LargestSmallestNumber largestSmallestNumber = new LargestSmallestNumber();
		int[] arr = largestSmallestNumber.takeInputFromUserInt(scanner);
		largestSmallestNumber.findLargestSmallestNum(arr);
		scanner.close();
	}
}
