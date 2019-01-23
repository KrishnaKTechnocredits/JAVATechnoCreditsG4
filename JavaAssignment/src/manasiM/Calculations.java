package manasiM;

public class Calculations 
{
	int sum(int x, int y)
	{
		return x+y;
	}
	int subtrac(int x, int y)
	{
		return x-y;
	}
	int mul(int x, int y)
	{
		return x*y;
	}
	
	int divide(int x, int y)
	{
		return x/y;
	}
	int remainder(int x, int y)
	{
		return x%y;
	}
	
	public static void main(String[] args) {
		
		Calculations cal = new Calculations();
		System.out.println("Sum of numbers is: "+cal.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Subtraction of numbers is: "+cal.subtrac(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Mutliplication of numbers is: "+cal.mul(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Division of numbers is: "+cal.divide(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Remainder is: "+cal.remainder(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}	
