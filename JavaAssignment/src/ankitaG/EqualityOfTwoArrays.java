package ankitaG;

import java.util.Scanner;
//This program compares two given arrays
public class EqualityOfTwoArrays
{
	////this method take input from user i.e. the length of array and elements of array 1
	int[] takeInputForArray1() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("enter size of array1");
		int size = scannerObj.nextInt();
		int[] num = new int[size];
		System.out.println("enter numbers for array 1");
		
		for (int index = 0; index < num.length; index++)
		{
			num[index] = scannerObj.nextInt();
		}
		System.out.println("values taken");
		return num;
	}
	//this method take input from user i.e. the length of array and elements of array 2
	int[] takeInputForArray2() {
		System.out.println("started second method");
		Scanner scannerObj1 = new Scanner(System.in);
		System.out.println("enter size of array2");
		int size = scannerObj1.nextInt();
		int[] num1 = new int[size];
		System.out.println("enter numbers for array 2");
		
		for (int index = 0; index < num1.length; index++) 
		{
			num1[index] = scannerObj1.nextInt();
		}
		scannerObj1.close();
		return num1;
	}
//This method compares two given arrays
	void comparingTwoArrays(int[] num, int[] num1) {
		int arrayLength1 = num.length;
		int arraylength2 = num1.length;
		boolean flag = false;
		
		if (arrayLength1 != arraylength2)
		{
			flag = false;
		} else {
			for (int index = 0; index < num.length; index++) {
				if (num[index] == num1[index]) {
					flag = true;
				}
			}
		}
		if (flag == true) {
			System.out.println("arrays are matching");
		} else {
			System.out.println("arrays are not matching");
		}
	}

	public static void main(String[] args) {
		EqualityOfTwoArrays eota = new EqualityOfTwoArrays();
		int[] num = eota.takeInputForArray1();
		int[] num1 = eota.takeInputForArray2();
		eota.comparingTwoArrays(num, num1);
	}

}
