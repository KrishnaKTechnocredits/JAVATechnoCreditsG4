package prachiJ;

import prachiJ.SimpleInterestFind;

public class SimpleInterestFind {

	static void simpleInterestCompute(long p, float r, float t)
	{
		double simpleInterest = (double)(p*r*t)/100;
		System.out.println("Simple Interest is: " + simpleInterest);
	}
	public static void main(String[] args) {
		long p = Long.parseLong(args[0]);
		float r = Float.parseFloat(args[1]);
		float t = Float.parseFloat(args[2]);
		
		simpleInterestCompute(p,r,t);
	}

}
