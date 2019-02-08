package pallavi;

// Largest and smallest number in unsorted array

import java.util.Scanner;

public class SmallestAndLargestNo_Q4 
{
	/*
	 this method provides input to user in form of array 
	 arrayLength :size/length of array 
	 num:num is an array of integer type
	 */

	int[] takeInputFromUser() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of inputs :");
		int arrayLength = sc.nextInt();
		int[] num = new int[arrayLength];
		System.out.println("Enter the numbers now");
		for (int index = 0; index < num.length; index++) 
		{
			num[index] = sc.nextInt();
		}
		return num;
	}
	
	/*
	 this method provides minimum and maximum number from a given array 
	 where int[] input is the array given by user of integer type
	 */

	void minMaxNumber(int[] input) 
	{
		int max = 0;
		int min = input[0];
		for (int index = 0; index < input.length; index++) 
		{
			if (max < input[index]) 
			{
				max = input[index];
			}
		}
		for (int count = 1; count < input.length; count++) 
		{
			if (min > input[count]) 
			{
				min = input[count];
			}
		}
		System.out.println("Largest no is:" + max);
		System.out.println("Smallest no is:" + min);
	}

	public static void main(String[] args) 
	{
		SmallestAndLargestNo_Q4 smallLargestNo = new SmallestAndLargestNo_Q4();
		int[] input = smallLargestNo.takeInputFromUser();
		smallLargestNo.minMaxNumber(input);
	}

}
