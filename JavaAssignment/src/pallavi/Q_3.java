package pallavi;

//WAP to find the square and cube of a number

public class Q_3 {

	void findSquare(int num) {
		int square = num * num;
		System.out.println("Square of " + num + " is : " + square);
	}

	void findCube(int num) {
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is : " + cube);
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Q_3 q = new Q_3();
		q.findSquare(num);
		q.findCube(num);
	}
}
