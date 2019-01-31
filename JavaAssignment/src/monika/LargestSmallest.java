package monika;

import java.util.Scanner;

public class LargestSmallest {
	public void inputffromUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of input :");
		int size = sc.nextInt();
		System.out.println("Enter Numbers:");
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextInt();
		}
		System.out.println("Entered numbers are :");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		int smallest = num[0];
		int largest = num[0];
		for(int i=1; i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest = num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("The largest number in array is "+largest);
		System.out.println("The smallest number in array is "+smallest);
		
	}

	public static void main(String[] args) {
		LargestSmallest ls = new LargestSmallest();
		ls.inputffromUser();

	}

}
