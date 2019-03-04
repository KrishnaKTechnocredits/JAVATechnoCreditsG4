package prachiJ;

import java.util.Scanner;

//To find all different index from given array
public class AllDiffIndex {
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
	 * Description: This method is to find all Different index from given arrays
	 * @param arr1 for passing 1st array
	 * @param arr2 for passing 2nd array
	 * @return Nothing
	 */
	void findAllDiffIndex(int[] arr1, int[] arr2) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				System.out.println("Values are not matching at index-> " + index);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AllDiffIndex allDiffIndex = new AllDiffIndex();
		int[] arr1 = allDiffIndex.takeInputFromUserInt(scanner);
		int[] arr2 = allDiffIndex.takeInputFromUserInt(scanner);
		allDiffIndex.findAllDiffIndex(arr1, arr2);
		scanner.close();
	}
}
