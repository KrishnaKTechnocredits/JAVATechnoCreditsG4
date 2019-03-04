// find sum of all prime number between user given range

package monika;

public class PrimeNumberSum {
	 static int min,max;
	    static int count =0;
		static int sum=0;
		public static void main(String [] a)
		{
		int min = Integer.parseInt(a[0]);
		int max =Integer.parseInt(a[1]);
		 for(int num =min; num<max;num++)
			{
			boolean f = isPrime(num);
			if (f==false)
			{
				System.out.println(num +" is  prime");
				sum = sum +num;
				count++;
			}
			}
		System.out.println("Sum is " +sum);
		}
	static boolean isPrime(int num) 
	{
			boolean flag = false;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}

			}
			return flag;	
		}
	}
