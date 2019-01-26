package prachiJ;

import prachiJ.Cal;

public class Cal {
	int sum(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	int sub(int a, int b)
	{
		int sub = a-b;
		return sub;		
	}
	int mul(int a, int b)
	{
		int mul = a*b;
		return mul;		
	}
	int div(int a, int b)
	{
		int div = a/b;
		return div;		
	}
	int remainder(int a, int b)
	{
		int rem = a%b;
		return rem;		
	}
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Cal c = new Cal();
		int sum = c.sum(a,b);
		int sub = c.sub(a,b);
		int mul = c.mul(a,b);
	    int div = c.div(a,b);
		int rem = c.remainder(a,b);
		System.out.println("Addition is: " + sum);
		System.out.println("Substraction is: " + sub);
		System.out.println("Multiplication is: " + mul);
		System.out.println("Division is: " + div);
		System.out.println("Reminder is: " + rem);
	}

}
