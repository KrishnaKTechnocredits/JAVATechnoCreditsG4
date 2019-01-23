package piyushS;

public class Q5 {

	static void simpleInt(int principle, int time, double rate) {

		double SI = (principle * rate * time) / 100;
		System.out.println("Simple Interest is " + SI);
	}

	public static void main(String[] args) {
		simpleInt(10, 5, 3.5);
	}

}
