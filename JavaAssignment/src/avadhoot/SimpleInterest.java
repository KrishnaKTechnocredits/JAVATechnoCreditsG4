package avadhoot;

public class SimpleInterest 
{
	double calculateinterest(int p,float t,float r)
	{
		return p*t*r/100;
	}
	public static void main(String[] args) 
	{
		double interest=new SimpleInterest().calculateinterest(Integer.parseInt(args[0]),Float.parseFloat(args[1]),Float.parseFloat(args[2]));
		System.out.println("Simple interest is "+interest);
	}
}
