package akshata;

public class Assignment_Q8 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		;
		int temp = Integer.parseInt(args[2]);
		Assignment_Q8 Q8 = new Assignment_Q8();
		System.out.println("before swapping:");
		System.out.println("value of x is:" + x);
		System.out.println("value of y is:" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("after swapping:");
		System.out.println("value of x is:" + x);
		System.out.println("value of y is:" + y);

	}

	void swapping(int x, int y, int temp) {

	}

}
