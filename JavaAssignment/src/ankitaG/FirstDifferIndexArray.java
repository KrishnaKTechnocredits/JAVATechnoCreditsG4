package ankitaG;

import java.util.Scanner;
//This program gives first differ index in comparison on two given arrays
public class FirstDifferIndexArray
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
		return num;
	}
//this method take input from user i.e. the length of array and elements of array 1
	int[] takeInputForArray2()
	{	
		Scanner scannerObj1 = new Scanner(System.in);
		System.out.println("enter size of array2");
		int size = scannerObj1.nextInt();
		int[] num1 = new int[size];
		System.out.println("enter numbers for array 2");
		for (int index = 0; index < num1.length; index++) {
			num1[index] = scannerObj1.nextInt();
		}
		scannerObj1.close();
		return num1;
	}
//This method gives first differ index in comparison on two given arrays
	void findFirstDifferIndex(int[] num, int[] num1) {
		int arrayLength1 = num.length;
		int arraylength2 = num1.length;
		boolean flag = false;

		if (arrayLength1 != arraylength2)
		{
			System.out.println("arrays are not matching to find first different index...ending program");
		} 
		else 
		{
			
			for (int index = 0; index < num.length; index++) 
			{
				if (num[index] != num1[index])
				{
					flag = true;
				}
				if (flag == true)
				{
					System.out.println("first different index is: " + index);
					break;
				}
				
			}
			if(flag==false)
			{
				System.out.println("arrays are matching...no mismatch found");
				
			}

		}
	}
	public static void main(String[] args) {
		FirstDifferIndexArray fDIA=new FirstDifferIndexArray();
		int[] num=fDIA.takeInputForArray1();
		int[] num1=fDIA.takeInputForArray2();
		fDIA.findFirstDifferIndex(num, num1);
		
	}
}
