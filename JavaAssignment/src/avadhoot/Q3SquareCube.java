package avadhoot;

public class Q3SquareCube 
{
	int square(int no)
	{
		return no*no;
	}
	int cube(int no)
	{
		return no*no*no;
	}
	public static void main(String[] args) 
	{
		Q3SquareCube sc=new Q3SquareCube();
		System.out.println("Square of the no is "+sc.square(Integer.parseInt(args[0])));
		System.out.println("Square of the no is "+sc.cube(Integer.parseInt(args[0])));
	}
}
