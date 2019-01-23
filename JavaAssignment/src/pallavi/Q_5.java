package pallavi;

//Write a Java program to compute simple interest

public class Q_5 {

	void simpleInterest(float principal, int time, float rate) {
		float SI = (principal * time * rate) / 100;
		System.out.println("Simple interest is " + SI);
	}

	public static void main(String[] args) {
		float P = Float.parseFloat(args[0]);
		int T = Integer.parseInt(args[1]);
		float R = Float.parseFloat(args[2]);
		Q_5 q = new Q_5();
		q.simpleInterest(P, T, R);
	}
}
