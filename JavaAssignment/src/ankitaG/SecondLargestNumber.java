package ankitaG;

import java.util.Scanner;

public class SecondLargestNumber {

	int[] takeInputFromUser()
	{
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scannerObj.nextInt();
		int[] num=new int[size];
		System.out.println("enter numbers");
		for (int index=0;index<num.length;index++)
		{
			num[index]=scannerObj.nextInt();
		}
		scannerObj.close();
		return num;
	}
	int findSecondSmallestNumber(int [] num)
	{
		int maxNumber=0;
		int secondMax=0;
		for (int index=0; index<num.length;index++)
		{			
			if(maxNumber<num[index])
			{
				secondMax=maxNumber;
				maxNumber=num[index];
			}
			if(num[index]<maxNumber && num[index]>secondMax){
				secondMax=num[index];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		SecondLargestNumber sln=new SecondLargestNumber();
		int [] num=sln.takeInputFromUser();
		int secondLargestNum=sln.findSecondSmallestNumber(num);
		System.out.println("Second largest number is : "+ secondLargestNum);
	}
}
