package prachiJ;

import java.util.Scanner;

//To Find Second Largest Element in array
public class SecondLargestElement {
	/*
	 * Description: This method is to input random values in array
	 * @param Nothing
	 * @return returns array containing values entered by user
	 */
	int[] takeInputFromUserInt() {
		Scanner scanner = new Scanner(System.in);
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
		scanner.close();
		return arr;
	}

	/*
	 * Description: This method is to find second largest element in array
	 * @param arr for passing array
	 * @return Nothing
	 */
	void findSecondLargest(int[] arr) {
		int max = arr[0], secMax = 0;
		for (int index = 0; index < arr.length-1 ; index++) {
			if (max < arr[index + 1])
				;
			{
				secMax = max;
				max = arr[index + 1];
			}
		}
		System.out.println("Second largest in array is: " + secMax);
	}

	public static void main(String[] args) {
		SecondLargestElement secondLargestElement = new SecondLargestElement();
		int[] arr = secondLargestElement.takeInputFromUserInt();
		secondLargestElement.findSecondLargest(arr);
	}
}
