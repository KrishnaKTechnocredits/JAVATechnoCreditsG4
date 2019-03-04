package prachiJ;

import java.util.Scanner;

//To find all pairs on integer array whose sum is equal to given number	
public class FindPairs {
	/*
	 * Description: This method is to input random values in array
	 * @param scanner for passing object of Scanner class
	 * @return returns array containing values entered by user
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
	 * Description: This method is to find all pairs in integer array whose sum is
	 * equal to given number
	 * @param scanner for passing object of Scanner class
	 * @param arr for passing array
	 * @return Nothing
	 */
	void findPairsFromSum(Scanner scanner, int[] arr) {
		System.out.println("Enter value of sum of any 2 random no. from array:");
		int sum = scanner.nextInt();
		System.out.println("Integer numbers, whose sum is equal to value: " + sum);
		for (int index1 = 0; index1 < arr.length; index1++) {
			for (int index2 = index1 + 1; index2 < arr.length; index2++) {
				if ((arr[index1] + arr[index2]) == sum) {
					System.out.println("(" + arr[index1] + "," + arr[index2] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FindPairs findPairs = new FindPairs();
		int[] arr = findPairs.takeInputFromUserInt(scanner);
		findPairs.findPairsFromSum(scanner, arr);
	}

}
