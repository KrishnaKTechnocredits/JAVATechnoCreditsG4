package pallavi;

//Find max value at differed index

import java.util.Scanner;

public class MaxValueAtDifferIndex_Q10 
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

	void maxValueAtDifferedIndexOfArray(int[] firstArray, int[] secondArray) 
	{
		for (int index = 0; index < firstArray.length; index++) 
		{
			if (firstArray[index] != secondArray[index]) 
			{
				System.out.println("Values are not matching at index " + index);
				if (firstArray[index] > secondArray[index]) 
				{
					int max = firstArray[index];
					System.out.println("From " + firstArray[index] + "," + secondArray[index] + " max value is " + max);
				} 
				else 
				{
					int max = secondArray[index];
					System.out.println("From " + firstArray[index] + "," + secondArray[index] + " max value is " + max);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		MaxValueAtDifferIndex_Q10 maxValueAtDifferentIndex = new MaxValueAtDifferIndex_Q10();
		int[] firstArray = maxValueAtDifferentIndex.takeInputFromUser();
		int[] secondArray = maxValueAtDifferentIndex.takeInputFromUser();
		maxValueAtDifferentIndex.maxValueAtDifferedIndexOfArray(firstArray, secondArray);
	}
}
