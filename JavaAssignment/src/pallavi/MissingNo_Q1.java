package pallavi;

//Find the missing number in integer array of 1 to 10

import java.util.Scanner;

public class MissingNo_Q1 
{
	int arrayLength;

	/*
	 * this method provides input to user in form of array
	 * arrayLength:size/length of array 
	 * num:num is an array of integer type
	 */

	int[] takeInputFromUser() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of inputs :");
		arrayLength = scanner.nextInt();
		int[] num = new int[arrayLength];
		System.out.println("Enter the numbers now");
		for (int index = 0; index < num.length; index++) 
		{
			num[index] = scanner.nextInt();
		}
		return num;
	}

	/*
	 * this method provides missing number from a given array 
	 * where int[] input is the array given by user of integer type 
	 * and n is the total number of elements present in an array
	 */

	void missingNumber(int[] input, int n) 
	{
		int ActualSum = 0;
		int expectedSum = n * (n + 1) / 2;
		System.out.println("Expected Sum is: " + expectedSum);
		for (int i = 0; i < input.length; i++) 
		{
			ActualSum = ActualSum + input[i];
		}
		System.out.println("Actual Sum is: " + ActualSum);
		System.out.println("Missing number in array is: " + (expectedSum - ActualSum));
	}

	public static void main(String[] args) 
	{
		MissingNo_Q1 missingNo = new MissingNo_Q1();
		int[] input = missingNo.takeInputFromUser();
		missingNo.missingNumber(input, missingNo.arrayLength + 1);
	}
}
