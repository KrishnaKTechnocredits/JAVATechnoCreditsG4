package ankitaG;

public class Program10 {

	boolean primecheck(int num)
	{
		boolean flag = true;
		int i = 0;
		for (i = 2; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] a)
	{
		int start = Integer.parseInt(a[0]);
		int end = Integer.parseInt(a[1]);
		int sum = 0;
		Program10 p = new Program10();
		for (int i = start; i <= end; i++)
		{
			boolean flag = p.primecheck(i);
			if (flag == true) 
			{
				sum = sum + i;
			}
		}
		System.out.println("sum of all prime number between the given range is: " + sum);
	}
}
