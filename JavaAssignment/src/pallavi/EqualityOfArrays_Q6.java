package pallavi;

//Write a java program to check the equality of two arrays

import java.util.Scanner;

public class EqualityOfArrays_Q6 
{

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
	 * this method checks whether the length of given arrays is equal or not
	 * where firstArray and secondArray are the arrays provided by user of
	 * integer type
	 */

	void checkEqualityOfArrays(int[] firstArray, int[] secondArray) 
	{
		if (firstArray.length == secondArray.length) 
		{
			System.out.println("Two Arrays Are Equal");
		} else 
		{
			System.out.println("Two Arrays Are Not Equal");
		}
	}

	public static void main(String[] args) 
	{
		EqualityOfArrays_Q6 equalityOfArray = new EqualityOfArrays_Q6();
		System.out.println("Enter firstArray");
		int[] firstArray = equalityOfArray.takeInputFromUser();
		System.out.println("Enter secondArray");
		int[] secondArray = equalityOfArray.takeInputFromUser();
		equalityOfArray.checkEqualityOfArrays(firstArray, secondArray);
	}
}
