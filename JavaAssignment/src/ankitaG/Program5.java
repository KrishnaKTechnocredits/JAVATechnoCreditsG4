package ankitaG;

public class Program5 {
	float principalAmt;
	float rate;
	int year;
	float interest;

	void simpleInterestCal(float p, float r, int y) {
		principalAmt = p;
		rate = r;
		year = y;
		System.out.println("simple interest is: " + (principalAmt * rate * year) / 100);
	}

	public static void main(String[] args) {
		float principalAmt = Float.parseFloat(args[0]);
		float rate = Float.parseFloat(args[1]);
		int year = Integer.parseInt(args[2]);
		Program5 p5 = new Program5();
		p5.simpleInterestCal(principalAmt, rate, year);

	}
}
