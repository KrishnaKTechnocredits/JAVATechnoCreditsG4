package pallavi;

//Find all differ index from given arrays

import java.util.Scanner;

public class AllDifferIndex_Q9 
{
	static int index;

	/*
	 * this method provides input to user in form of array
	 * arrayLength:size/length of array 
	 * num:num is an array of integer type
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
	 * this method provides all different index of integer arrays provided by user 
	 * where firstArray and secondArray are the arrays provided by user of
	 * integer type
	 */

	void allDifferIndexFromArray(int[] firstArray, int[] secondArray) 
	{
		for (index = 0; index < firstArray.length; index++) 
		{
			if (firstArray[index] != secondArray[index]) 
			{
				System.out.println("Values are not matching at index " + index);
			}
		}
	}

	public static void main(String[] args) 
	{
		AllDifferIndex_Q9 allDifferIndex = new AllDifferIndex_Q9();
		int[] firstArray = allDifferIndex.takeInputFromUser();
		int[] secondArray = allDifferIndex.takeInputFromUser();
		allDifferIndex.allDifferIndexFromArray(firstArray, secondArray);
	}

}
