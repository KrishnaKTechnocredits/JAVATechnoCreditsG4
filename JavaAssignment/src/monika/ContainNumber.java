package monika;

import java.util.Scanner;

public class ContainNumber {
	static public void containnumber() {
		boolean flag = false;
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
		System.out.println("Enter the number to be find");
		int number = sc.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == number) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("Number is not present in array");
		else
			System.out.println("Number is present in array");
	}

	public static void main(String[] args) {
		ContainNumber.containnumber();

	}

}
