package ankitaG;

import java.util.Scanner;
//This program gives you max element at differed index
public class MaxValueAtIndexes
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
			// scannerObj.close();
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
//This method gives you max element at differed index
		void MaxValueAtDifferIndex(int[] num, int[] num1) {
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
					if (num[index]!= num1[index])
					{
						flag = true;
						if(num[index]> num1[index])
						{
							System.out.println("On differed index "+ index+" large number between"+"("+num[index]+","+num1[index]+")"+ "is "+num[index]);
						}
						else
						{
							System.out.println("On differed index "+ index+" large number between"+"("+num[index]+","+num1[index]+")"+ "is "+num1[index]);
						}						
					}
					if (flag == true)
					{
						System.out.println("Different index is: " + index);	
						flag=false;
					}				
				}			
		    }
		}
		public static void main(String[] args) {
			MaxValueAtIndexes mVAI=new MaxValueAtIndexes();
			int[] num=mVAI.takeInputForArray1();
			int[] num1=mVAI.takeInputForArray2();
			mVAI.MaxValueAtDifferIndex(num, num1);
			
		}


	}



