package prachiJ;

import java.util.Scanner;
//To check equality of two arrays
public class ArraysEquality {
	/*
	 * Description: This method is to input random values in array 
	 * @param scanner for passing object of Scanner class 
	 * @return returns array containing values entered by user
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
	 * Description: This method is to check if two arrays are equal or not
	 * @param arr1 for passing 1st array
	 * @param arr2 for passing 2nd array
	 * @return Nothing
	 */
	void arrayEqualityCheck(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length != arr2.length) {
			flag = false;
		} else {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
		}
		if (flag == true) {
			System.out.println("Two Arrays Are Equal");
		} else if (flag == false) {
			System.out.println("Two Arrays Are Not Equal");
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArraysEquality arraysEquality = new ArraysEquality();
		int[] arr1 = arraysEquality.takeInputFromUserInt(scanner);
		int[] arr2 = arraysEquality.takeInputFromUserInt(scanner);
		arraysEquality.arrayEqualityCheck(arr1, arr2);
		scanner.close();
	}
}
