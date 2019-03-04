package pallavi;

import java.util.Scanner;

public class LeapYear_Q3
{
	void isLeapYear() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year");
		int year = sc.nextInt();
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) 
		{
			System.out.println(year + " is a leap year");
		} 
		else 
		{
			System.out.println(year + " is not a leap year");
		}
	}

	public static void main(String[] args) 
	{
		LeapYear_Q3 leapYear = new LeapYear_Q3();
		leapYear.isLeapYear();
	}
}
