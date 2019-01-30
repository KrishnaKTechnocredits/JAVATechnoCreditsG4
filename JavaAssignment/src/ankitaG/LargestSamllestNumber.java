package ankitaG;

import java.util.Scanner;
//This program gives largest and smallest number in a given array
public class LargestSamllestNumber
{
//this method take input from user i.e. the length of array and elements of array 1
	int[] takeInputFromUser() {
		Scanner scannerDemo = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scannerDemo.nextInt();
		int[] num = new int[size];
		System.out.println("enter numbers");
		for (int index = 0; index < num.length; index++) {
			num[index] = scannerDemo.nextInt();
		}
		scannerDemo.close();
		System.out.println("values taken");
		return num;
	}
//This method gives largest and smallest number in a given array
	void largestSmallestNumber(int[] num) {
		int largestNumber = 0;
		int smallestNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (largestNumber < num[index]) {
				largestNumber = num[index];
			}
			if (smallestNumber > num[index]) {
				smallestNumber = num[index];
			}
		}
		System.out.println("largest number is : " + largestNumber);
		System.out.println("smallest number is : " + smallestNumber);
	}

	public static void main(String[] args) {
		LargestSamllestNumber lsn = new LargestSamllestNumber();
		int[] num = lsn.takeInputFromUser();
		lsn.largestSmallestNumber(num);
	}

}
