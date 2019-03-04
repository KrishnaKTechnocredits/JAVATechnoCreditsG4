package pallavi;

//Find first differ index from given arrays

import java.util.Scanner;

public class FirstDifferIndex_Q8 
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
	 * this method provides first different index of integer arrays provided by user
	 * where firstArray and secondArray are the arrays provided by user of integer type
	 */

	void firstDifferIndexOfArrays(int[] firstArray, int[] secondArray) 
	{
		for (index = 0; index < firstArray.length; index++) 
		{
			if (firstArray[index] != secondArray[index]) 
			{
				break;
			}
		}
		System.out.println("Values are not matching at index " + index);
	}

	public static void main(String[] args) 
	{
		FirstDifferIndex_Q8 firstDifferIndex = new FirstDifferIndex_Q8();
		int[] firstArray = firstDifferIndex.takeInputFromUser();
		int[] secondArray = firstDifferIndex.takeInputFromUser();
		firstDifferIndex.firstDifferIndexOfArrays(firstArray, secondArray);
	}
}
