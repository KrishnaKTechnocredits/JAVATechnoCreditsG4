package avadhoot;

public class Converter 
{
	void display(int sec)
	{
		int h=0;
		int m=0;
		int s=0;
		int temp=0;
		temp=sec/60;
		s=sec%60;
		h=temp/60;
		m=temp%60;
		
		System.out.println("Time is "+h+":"+m+":"+s);
	}
	public static void main(String[] args) 
	{
		new Converter().display(Integer.parseInt(args[0]));
	}
}
