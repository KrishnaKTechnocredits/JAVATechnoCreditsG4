package ankitaG;

import java.util.Scanner;
//This program gives duplicate number in given array
public class DuplicateNumber
{
//this method take input from user i.e. the length of array and elements of array 1
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
		scannerDemo.close();
		System.out.println("values taken");
		return num;
	}
	//this method gives duplicate number in given array
	int findDuplicateNumber(int[] num) {
		int lengthOfArray = num.length;
		int duplicateNumber = 0;
		int[] a = new int[lengthOfArray + 1];
		
		for (int index = 0; index < num.length; index++) 
		{
			a[num[index]] = a[num[index]] + 1;
			if (a[num[index]] > 1) {
				duplicateNumber = num[index];
			}
		}
		return duplicateNumber;
	}

	public static void main(String[] args) {
		DuplicateNumber p2 = new DuplicateNumber();
		int[] num = p2.takeInputFromUser();
		int duplicateNumber = p2.findDuplicateNumber(num);
		System.out.println("duplicate number is: " + duplicateNumber);

	}

}
