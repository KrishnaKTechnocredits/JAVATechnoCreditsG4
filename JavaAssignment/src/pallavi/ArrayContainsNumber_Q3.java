package pallavi;

//Check if array contains a number in Java

import java.util.Scanner;

public class ArrayContainsNumber_Q3 
{
	/*
	 * this method provides input to user in form of array
	 * arrayLength:size/length of array 
	 * num:num is an array of integer type
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
	 * this method provides whether the number is present in given array where
	 * int[] input is the array given by user of integer type 
	 * and key denotes the number which is present in an array
	 */

	boolean isNumberPresent(int[] input, int number) 
	{
		boolean flag = true;
		for (int index = 0; index < input.length; index++) 
		{
			if (input[index] != number) 
			{
				flag = false;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayContainsNumber_Q3 arrayContainsNumber = new ArrayContainsNumber_Q3();
		int[] input = arrayContainsNumber.takeInputFromUser();
		System.out.println("Enter number to be searched");
		int number = scanner.nextInt();
		boolean flagValue = arrayContainsNumber.isNumberPresent(input, number);
		if (flagValue == true) 
		{
			System.out.println(number + " is in array");
		} else 
		{
			System.out.println(number + " is not in array");
		}
	}
}
