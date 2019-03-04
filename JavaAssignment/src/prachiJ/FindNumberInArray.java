package prachiJ;

import java.util.Scanner;

//To find if a array contains a number
public class FindNumberInArray {
	/*
	 * Description: This method is to input random values in array and a number to
	 * be searched in array
	 * @param Nothing
	 * @return Nothing
	 */
	void takeInputFromUserInt() {
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
		System.out.println("Enter a number to be searched in array");
		int num = scanner.nextInt();
		scanner.close();
		searchNumInArray(arr, num);
	}

	/*
	 * Description: This method is to search a given number in array
	 * @param arr for array
	 * @param num for number to be searched
	 * @return Nothing
	 */
	void searchNumInArray(int[] arr, int num) {
		boolean flag = false;
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("number is not in array");
		} else if (flag == true) {
			System.out.println("number is in array");
		}
	}

	public static void main(String[] args) {
		FindNumberInArray findNumberInArray = new FindNumberInArray();
		findNumberInArray.takeInputFromUserInt();
	}
}
