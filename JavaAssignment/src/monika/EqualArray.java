package monika;

import java.util.Scanner;

public class EqualArray {

	static void checkequality (int[] arr1, int[] arr2, int size1, int size2)
	{
		boolean equal = true;
		if (size1 != size2)
		{
			equal = false;
		System.out.println("Arrays are not equal");
		}
		if(arr1.length == arr2.length)
		{
			for (int i = 0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					equal = false;
				}
			}
		}
		if(equal == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size1 = sc.nextInt();
		System.out.println("Enter size of Second array");
		int size2 = sc.nextInt();
		System.out.println("Enter Numbers of first array");
		int[] arr1 = new int[size1];
		for (int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Numbers of Second array");
		int[] arr2 = new int[size2];
		for (int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		checkequality(arr1,arr2, size1,size2);
	}

}
