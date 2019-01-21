// to calculate simple interest

package monika;

public class SimpleInterest {
	void si(int p, int r, int t) // method to calculate simple interest
	{
		double interest = (double) p*r*t/100;
		System.out.println("The simple interest is " +interest);
	}

	public static void main(String[] a) {
	SimpleInterest SI = new SimpleInterest();
    int p = Integer.parseInt(a[0]);
    int r = Integer.parseInt(a[1]);
    int t = Integer.parseInt(a[2]);
    SI.si(p, r, t);
	}

}
