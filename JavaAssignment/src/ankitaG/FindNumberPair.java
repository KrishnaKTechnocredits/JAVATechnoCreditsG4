package ankitaG;

import java.util.Scanner;
//This program gives the the pair of numbers in array which contributes in sum of given number 
public class FindNumberPair
{
	//this method take input from user i.e. the length of array and elements of array 1
	int[] takeInputForArray1() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("enter size of array1");
		int size = scannerObj.nextInt();
		int[] num = new int[size];
		System.out.println("enter numbers for array 1");
		for (int index = 0; index < num.length; index++) {
			num[index] = scannerObj.nextInt();
		}
		System.out.println("values taken");
		//scannerObj.close();
		return num;
	}

//This method gives the the pair of numbers in array which contributes in sum of given number
	void findNumberPair(int[] num)
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sum of numbers to be find in array");
	     int num1=sc.nextInt();
		for(int index=0;index<num.length;index++)
		{
			temp=num1-num[index];
			for(int count=index+1;count<num.length;count++)
			{
			if(temp==num[count])
			{
				System.out.println("pair is:"+ "("+num[index]+","+num[count]+")");
			}
		}
			temp=num1;
			sc.close();
		
	}
	}
	public static void main(String[] args) {
		FindNumberPair fNP=new FindNumberPair();
		int[] num=fNP.takeInputForArray1();
		fNP.findNumberPair(num);
		
	}

}
