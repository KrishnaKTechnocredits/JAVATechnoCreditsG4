package akshata;

public class Assignment_Q4 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int area_rectangle = rectangle_area(num1, num2);
		int perimeter_reactangle = rectangle_perimeter(num1, num2);
		int sq_area = square_area(num1);
		int sq_perimeter = square_perimeter(num1);
		System.out.println("area of rectangle is :" + area_rectangle);
		System.out.println("perimeter of rectangle is :" + perimeter_reactangle);
		System.out.println("area of square is :" + sq_area);
		System.out.println("perimeter of square is :" + sq_perimeter);
	}

	static int square_area(int a) {
		int area = a * a;
		return area;

	}

	static int square_perimeter(int a) {
		int perimeter = 4 * a;
		return perimeter;

	}

	static int rectangle_area(int l, int w) {
		int area = l * w;
		return area;

	}

	static int rectangle_perimeter(int l, int w) {
		int perimeter = 2 * l * w;
		return perimeter;

	}
}
