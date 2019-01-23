package avadhoot;

public class SwapNumbers 
{
	void swap(int x,int y)
	{
		System.out.println("Before swap X is "+x+" and Y is "+y);
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap X is "+x+" and Y is "+y);
	}
	public static void main(String[] args) 
	{
		new SwapNumbers().swap(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
