package prachiJ;

import java.util.Scanner;
 // To find missing number from integer array of 1 to 10
public class MissingNumberFind {
	/*
	 * Description: This method is to input values in array from 1 to 10 with any 1 number missing
	 * @param Nothing
	 * @return returns array containing values entered by user
	 */
	int[] InputFromUserInt() {
		System.out.println("Enter 9 numbers from 1 to 10 in sequential order with any 1 misssing:");
		int size = 10;
		int[] arr = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int index = 0; index < arr.length - 1; index++) {
			arr[index] = scanner.nextInt();
		}
		System.out.println("Numbers entered are: ");
		for (int index = 0; index < arr.length - 1; index++) {
			System.out.print(arr[index] + "\t");
		}
		System.out.println("\n");
		scanner.close();
		return arr;
	}
	/*
	 * Description: This method is to find the missing number in integer array of 1 to 10
	 * @param arr is for passing integer array from 1 to 10 with any 1 number missing
	 * @return Nothing
	 */
	void MissingNumFind(int arr[]) {
		int temp = 0;
		int missingNum = 0;
		for (int index = 0; index < arr.length - 1; index++) {
			if ((index + 1 + temp) != arr[index]) {
				missingNum = index + 1 + temp;
				System.out.println(missingNum + " is missing");
				temp = temp + 1;
			}
		}
	}

	public static void main(String args[]) {
		MissingNumberFind missingNumFind = new MissingNumberFind();
		int[] arr = missingNumFind.InputFromUserInt();
		missingNumFind.MissingNumFind(arr);
	}
}
