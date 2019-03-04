package pallavi;

// Find duplicate number on Integer array in Java

import java.util.Scanner;

public class DuplicateNumber_Q2 
{
	/*
	 * this method provides input to user in form of array
	 * arrayLength:size/length of array num:num is an array of integer type
	 */

	int[] takeInputFromUser() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of inputs :");
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
	 * this method provides duplicate number from a given array 
	 * where int[] input is the array given by user of integer type
	 */

	void isNumberDuplicate(int[] input) 
	{
		for (int index = 0; index < input.length; index++) 
		{
			for (int count = index + 1; count < input.length; count++) 
			{
				if (input[index] == input[count]) 
				{
					System.out.println("Duplicate number is: " + input[index]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		DuplicateNumber_Q2 duplicateNo = new DuplicateNumber_Q2();
		int[] input = duplicateNo.takeInputFromUser();
		duplicateNo.isNumberDuplicate(input);
	}
}
