package prachiJ;

import prachiJ.SwapVariable;

class SwapVariable
{
	static void swapVar(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped variables are: " + a + "," + b);

	
	}
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		swapVar(a,b);	
	}
}
