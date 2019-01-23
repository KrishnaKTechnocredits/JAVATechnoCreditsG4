package manasiM;

public class Square_cube {
	int square_cal(int x) {
		return x * x;
	}

	int cube_cal(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {
		Square_cube sc = new Square_cube();
		System.out.println("Square of the number is: " + sc.square_cal(Integer.parseInt(args[0])));
		System.out.println("Cube of the number is: " + sc.cube_cal(Integer.parseInt(args[0])));
	}

}
