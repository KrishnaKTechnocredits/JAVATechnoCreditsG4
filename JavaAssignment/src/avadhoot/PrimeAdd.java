package avadhoot;

public class PrimeAdd 
{
	void primeCheck(int x,int y)
	{
		int sum=0;
		for(int j=x;j<=y;j++)
		{
			boolean flag=false;
			for(int i=2;i<j;i++)
			{
				if (j%i==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				sum=sum+j;
			}
		}
		System.out.println("Sum of prime no is "+sum);
	}	
	public static void main(String[]args)
	{
		PrimeAdd ad=new PrimeAdd();
		ad.primeCheck(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
