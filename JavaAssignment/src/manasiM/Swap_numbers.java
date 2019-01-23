package manasiM;

public class Swap_numbers 
{
	void swap(int x, int y)
	{
		System.out.println("Before Swap X is " +x +" and Y is "+y);
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swap X is "+x+" and Y is "+y);
		
	}
	
	public static void main(String args[])
	{
		new Swap_numbers().swap(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
	}

}
