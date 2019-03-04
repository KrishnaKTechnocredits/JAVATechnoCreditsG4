package pallavi;

//Find all pairs of integer array whose sum is equal to given number

import java.util.Scanner;

public class SumOfIntegerPairEqualToNumber_Q7 
{
	/*
	 * this method provides input to user in form of array
	 * arrayLength:size/length of array 
	 * num:num is an array of integer type
	 */

	int[] takeInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of inputs :");
		int arrayLength = scanner.nextInt();
		int[] num = new int[arrayLength];
		System.out.println("Enter the numbers now");
		for (int index = 0; index < num.length; index++) {
			num[index] = scanner.nextInt();
		}
		return num;
	}

	/*
	 * this method provides all pairs of integer array whose sum is equal to
	 * given number where firstArray and secondArray are the arrays provided by
	 * user of integer type
	 */

	void sumIsEqualToGivenNumber(int[] firstArray) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sum");
		int sum = scanner.nextInt();
		System.out.println("Integer numbers, whose sum is equal to value:" + sum);
		for (int index1 = 0; index1 < firstArray.length; index1++) 
		{
			for (int index2 = index1 + 1; index2 < firstArray.length; index2++) 
			{
				if (firstArray[index1] + firstArray[index2] == sum) 
				{
					System.out.println(firstArray[index1] + "," + firstArray[index2]);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		SumOfIntegerPairEqualToNumber_Q7 sumOfIntegerPair = new SumOfIntegerPairEqualToNumber_Q7();
		int[] firstArray = sumOfIntegerPair.takeInputFromUser();
		sumOfIntegerPair.sumIsEqualToGivenNumber(firstArray);
	}
}
