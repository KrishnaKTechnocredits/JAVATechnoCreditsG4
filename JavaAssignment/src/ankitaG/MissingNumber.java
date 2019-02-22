package ankitaG;

import java.util.Scanner;

//This program gives missing number in the array of 1 to 10 number
public class MissingNumber{
	
	// this method will take input of numbers from user to create array
	int[] takeInputFromUser() {
		Scanner scannerDemo = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scannerDemo.nextInt();
		int[] number = new int[size];
		System.out.println("enter numbersof array");
		for (int index = 0; index < number.length; index++) {
			number[index] = scannerDemo.nextInt();
		}
		return number;
	}

	// this gives missing number in the give array
	int NumberMissing(int[] number,int n)
	{
		int asum=0;
		int esum=n*n+1/2;
		
		for (int index=0;index<number.length;index++)
		{
			asum=asum+number[index];
		}
		
		System.out.println("expected sum"+ esum);
		System.out.println("actual sum"+ asum);
		
		int missingNumber=esum-asum;
		return missingNumber;
	}

	public static void main(String[] args) {
		MissingNumber mN = new MissingNumber();
		int[] number = mN.takeInputFromUser();
		Scanner scannerDemo = new Scanner(System.in);
		System.out.println("Enter missing number");
		int missingnum=scannerDemo.nextInt();
		int missingNumber=mN.NumberMissing(number,missingnum);
		System.out.println("missing number in the given array is: " + missingNumber);
	}

}
