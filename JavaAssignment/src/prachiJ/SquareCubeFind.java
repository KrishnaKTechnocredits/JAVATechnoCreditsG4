package prachiJ;

import prachiJ.SquareCubeFind;

public class SquareCubeFind 
{ 
	static long squareFind(int n)
	{
		long s = n*n;
		return s;
		
	}
	
    static long cubeFind(int n)
	{
		long c = n*n*n;
		return c;
	}
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		long s = squareFind(n);
		long c = cubeFind(n);
		System.out.println("Square of " + n + " is: " + s);
		System.out.println("Cube of " + n + " is: " + c);
	}
}
