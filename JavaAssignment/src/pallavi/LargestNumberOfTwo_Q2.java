package pallavi;

import java.util.Scanner;

public class LargestNumberOfTwo_Q2 
{
	void largestNumberOfTwo() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		int max;
		max = num1 > num2 ? num1 : num2;
		System.out.println("Largest number between " + num1 + " and " + num2 + " is : " + max);
	}

	public static void main(String[] args) 
	{
		LargestNumberOfTwo_Q2 largestNumber = new LargestNumberOfTwo_Q2();
		largestNumber.largestNumberOfTwo();
	}
}
