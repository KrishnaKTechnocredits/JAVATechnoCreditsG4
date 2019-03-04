package avadhoot;

public class Swap 
{
	void display(int x,int y)
	{
		System.out.println("Before swap X is "+x+" and Y is "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap X is "+x+" and Y is "+y);
	}
	public static void main(String[] args) 
	{
		new Swap().display(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
