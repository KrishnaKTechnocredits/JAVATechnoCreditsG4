package prachiJ;

import prachiJ.PrimeNumbersInUserRange;

class PrimeNumbersInUserRange
{
	static void primeFind(int start, int end)
	{
		int sum = 0;	
		int i,j;
		for(i=start; i <= end; i++)
		{
			boolean flag = true;
			for(j=2;j<=(i/2);j++)
			{
				if(i%j == 0 && i!=j)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of all prime numbers is: " +sum);
	}
	public static void main(String args[])
	{
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		primeFind(start,end);	
	}
}