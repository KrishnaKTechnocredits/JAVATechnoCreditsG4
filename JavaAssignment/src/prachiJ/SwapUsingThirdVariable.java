package prachiJ;

import prachiJ.SwapUsingThirdVariable;

class SwapUsingThirdVariable
{
	static void swapVar(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped variables are: " + a + "," + b);

	
	}
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		swapVar(a,b);	
	}
}
