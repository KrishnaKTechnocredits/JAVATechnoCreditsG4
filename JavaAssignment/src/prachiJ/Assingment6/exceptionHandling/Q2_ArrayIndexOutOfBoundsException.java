package prachiJ.Assingment6.exceptionHandling;

import java.util.Scanner;

//A Class that represents ArrayIndexOutOfBoundsException 
public class Q2_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter values in array: ");
		try { // with try catch block programs does not end abruptly and will
				// continue further execution
			for (int i = 0; i <= arr.length; i++) // going beyond index
			{
				arr[i] = sc.nextInt();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please enter valid index");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
