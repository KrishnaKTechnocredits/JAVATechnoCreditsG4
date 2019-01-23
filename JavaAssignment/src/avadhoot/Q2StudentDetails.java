package avadhoot;

import java.util.concurrent.SynchronousQueue;

public class Q2StudentDetails 
{
	void display(int num,String name,int marks)
	{
		System.out.println("Roll no. is "+num);
		System.out.println("Name is "+name);
		System.out.println("Marks are "+marks);
	}
	public static void main(String args[])
	{
		Q2StudentDetails std=new Q2StudentDetails();
		std.display(Integer.parseInt(args[0]),args[1],Integer.parseInt(args[2]));
	}
}
