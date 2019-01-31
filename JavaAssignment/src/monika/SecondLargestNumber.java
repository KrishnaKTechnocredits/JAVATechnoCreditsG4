package monika;

import java.util.Scanner;

public class SecondLargestNumber {

	static void secondlargest(int[] num)
	{
		int max=num[0];
		int secondmax = num[1];
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				secondmax=max;
				max=num[i];
			}
		}
		System.out.println("the second largest number is " +secondmax);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of input :");
		int size = sc.nextInt();
		System.out.println("Enter Numbers:");
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextInt();
		}
		SecondLargestNumber.secondlargest(num);
		
	}

}
