package prachiJ;

import java.util.Scanner;
//To find duplicate number on integer array
public class DuplicateNumbersFind {
	public static void main(String args[]) {
		DuplicateNumbersFind duplicateNumbersFind = new DuplicateNumbersFind();
		duplicateNumbersFind.takeInputFromUserInt();
	}
	/*
	 * Description: This method is to input values in array for given size with duplicate number present
	 * @param Nothing
	 * @return Nothing
	 */
	void takeInputFromUserInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count of numbers to find duplicate from:");
		int count = scanner.nextInt();
		int end = count - 2; //here, the array contains 1,but if the array doesn't contains 0 then end will be count-1
		System.out.println("Enter " + count + " numbers starting from 0 to " + (end) + " with 1 no. repeated twice:");
		int[] dupArray = new int[count];
		for (int index = 0; index < dupArray.length; index++) {
			dupArray[index] = scanner.nextInt();
		}

		for (int index = 0; index < dupArray.length; index++) {
			System.out.print(dupArray[index] + "\t");
		}
		System.out.println("");
		scanner.close();
		findDuplicateNumbers(dupArray, end);
	}
	/*
	 * Description: This method is to find duplicate number in integer array of given size
	 * @param dupArray for integer array of given size
	 * @param n for higher limit
	 * @return Nothing
	 */
	void findDuplicateNumbers(int[] dupArray, int n) {
		int actualSum = 0;
		for (int index = 0; index < dupArray.length; index++) {
			actualSum = dupArray[index] + actualSum;
		}
		int expectedSum = (n * (n + 1)) / 2;
		if (actualSum != expectedSum) {
			int dupNumber = actualSum - expectedSum;
			System.out.println(dupNumber + " is a duplicate number");
		}
	}
}
