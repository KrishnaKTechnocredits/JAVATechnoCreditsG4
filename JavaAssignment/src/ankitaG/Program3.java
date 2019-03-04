package ankitaG;

public class Program3 {
	void square(int number) {
		int square = number * number;
		System.out.println(square);
	}

	void cube(int number) {
		int cube = number * number * number;
		System.out.println(cube);
	}

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		Program3 p3 = new Program3();
		p3.square(number);
		p3.cube(number);
	}

}
