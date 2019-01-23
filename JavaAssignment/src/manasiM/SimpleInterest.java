package manasiM;

public class SimpleInterest {

	double calculate_interest(int p, float t, float r) {

		return p * t * r / 100;

	}

	public static void main(String[] args) {
		double Interest = new SimpleInterest().calculate_interest(Integer.parseInt(args[0]), Float.parseFloat(args[1]),
				Float.parseFloat(args[2]));
		System.out.println("Simple Interest is: " + Interest);
	}

}
