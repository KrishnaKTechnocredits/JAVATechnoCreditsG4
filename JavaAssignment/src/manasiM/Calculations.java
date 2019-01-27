package manasiM;

public class Calculations 
{
	int sumOperation(int x, int y)
	{
		return x+y;
	}
	int subtracOperation(int x, int y)
	{
		return x-y;
	}
	int mulOperation(int x, int y)
	{
		return x*y;
	}
	
	int divideOperation(int x, int y)
	{
		return x/y;
	}
	int remainderOperation(int x, int y)
	{
		return x%y;
	}
	
	public static void main(String[] args) {
		
		Calculations cal = new Calculations();
		System.out.println("Sum of numbers is: "+cal.sumOperation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Subtraction of numbers is: "+cal.subtracOperation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Mutliplication of numbers is: "+cal.mulOperation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Division of numbers is: "+cal.divideOperation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Remainder is: "+cal.remainderOperation(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}	
