package ankitaG;

import java.util.Scanner;
//This program gives presence of a number in given array
public class CheckNumberInArray {

	//this method take input from user i.e. the length of array and elements of array
	int[] takeInputFromUser() {
		Scanner scannerDemo = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scannerDemo.nextInt();
		int[] num = new int[size];
		System.out.println("enter numbers");
		
		for (int index = 0; index < num.length; index++)
		{
			num[index] = scannerDemo.nextInt();
		}
		System.out.println("values taken");
		return num;
	}

	// This method evaluates the presence of a number in given array
	void checkPresenceOfNumberInArray(int[] num, int num1) 
	{
		int count = 0;
		for (int index = 0; index < num.length; index++) 
		{
			if (num[index] == num1)
			{
				count++;
			}
		}
		if (count > 0)
		{
			System.out.println(num1 + " is  present in the given array");
		} else
		{
			System.out.println(num1 + " is not present in the given array");
		}

	}

	public static void main(String[] args) {
		CheckNumberInArray cnia = new CheckNumberInArray();
		int[] num = cnia.takeInputFromUser();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to find in array");
		int num1= sc.nextInt();
		cnia.checkPresenceOfNumberInArray(num, num1);
		sc.close();
	}

}
