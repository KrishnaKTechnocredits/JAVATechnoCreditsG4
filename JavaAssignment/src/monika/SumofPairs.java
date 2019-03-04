package monika;

import java.util.Scanner;

public class SumofPairs {
	
static public void pairsum() {
		
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
		System.out.println("Enter the sum of pairs");
		int number = sc.nextInt();
		for (int i = 0; i<num.length; i++)
		{
			for (int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==number)
					System.out.println("Output is {"+num[i]+","+num[j]+"}" );
			}
		}
}

	
	public static void main(String[] args) {
		SumofPairs.pairsum();

	}

}
