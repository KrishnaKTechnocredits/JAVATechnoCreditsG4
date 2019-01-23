package akshata;

public class Assignment_Q5 {

	public static void main(String[] args) {
		float p = Integer.parseInt(args[0]);
		float t = Integer.parseInt(args[1]);
		float r = Integer.parseInt(args[2]);
		float simpleinterest = simpleinterest(p, t, r);
		System.out.println("simple interest is :" + simpleinterest);

	}

	static float simpleinterest(float p, float t, float r) {
		float simpleinterest = (p * t * r) / 100;
		return simpleinterest;
	}
}
