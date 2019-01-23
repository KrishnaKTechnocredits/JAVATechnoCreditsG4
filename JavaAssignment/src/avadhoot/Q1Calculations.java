package avadhoot;

public class Q1Calculations 
{
	int sum(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mul(int x,int y)
	{
		return x*y;
	}
	int div(int x,int y)
	{
		return x/y;
	}
	int remainder(int x,int y)
	{
		return x%y;
	}
	public static void main(String args[])
	{
		Q1Calculations cal= new Q1Calculations();
		System.out.println("Sum of numbers is "+ cal.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Sum of numbers is "+ cal.sub(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Sum of numbers is "+ cal.mul(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Sum of numbers is "+ cal.div(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Sum of numbers is "+ cal.remainder(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}
