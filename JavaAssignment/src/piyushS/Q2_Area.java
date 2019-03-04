package piyushS;

public class Q2_Area {

	void area(double radius) {
		double circleArea = (3.14 * radius * radius);
		System.out.println("Area of a Circle is " + circleArea);

	}

	void area(int length, int breadth) {
		int rectangleArea = length * breadth;

		System.out.println("Area of a Rectangle is " + rectangleArea);

	}

	void area(int side) {
		int squareArea = (side * side);

		System.out.println("Area of a Square is " + squareArea);

	}

	public static void main(String[] args) {

		Q2_Area obj = new Q2_Area();
		obj.area(5.0);
		obj.area(9);
		obj.area(5, 6);
	
	}

}
