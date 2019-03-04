package pallavi;

// Write a java program to find second largest element in an array of integers

import java.util.Scanner;

public class SecondLargest_Q5 
{
	/*
	 this method provides input to user in form of array 
	 arrayLength :size/length of array 
	 num:num is an array of integer type
	 */
	
	int[] takeInputFromUser() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter: ");
		int arrayLength = scanner.nextInt();
		int[] num = new int[arrayLength];
		System.out.println("Enter the numbers now");
		for (int index = 0; index < num.length; index++) 
		{
			num[index] = scanner.nextInt();
		}
		return num;
	}
	
	/*
	 this method provides second largest number from a given array 
	 where int[] input is the array given by user of integer type
	 */

	void secondLargestNumber(int[] input) 
	{
		int largestNo = input[0];
		int secondLargestNo = input[0];
		for (int index = 0; index < input.length; index++) 
		{
			if (largestNo < input[index]) 
			{
				secondLargestNo = largestNo;
				largestNo = input[index];
			} 
			else if(input[index]>secondLargestNo)
			{
				secondLargestNo = input[index];
			}
		}
		System.out.println("Second Largest element in array is :" + secondLargestNo);
	}

	public static void main(String[] args) 
	{
		SecondLargest_Q5 secondLargest = new SecondLargest_Q5();
		int[] input = secondLargest.takeInputFromUser();
		secondLargest.secondLargestNumber(input);
	}
}
