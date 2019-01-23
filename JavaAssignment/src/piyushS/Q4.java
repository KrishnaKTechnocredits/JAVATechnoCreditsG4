package piyushS;

public class Q4 {

	void areaOfCircle(int radius1) {
		float circleArea = (float) (3.14 * radius1 * radius1);

		System.out.println("Area of a Circle is " + circleArea);

	}

	void areaOfRectangle(int length1, int breadth1) {
		int rectangleArea = length1 * breadth1;

		System.out.println("Area of a Rectangle is " + rectangleArea);

	}

	void perimeterOfCircle(int radius2) {
		float circlePerimeter = (float) (2 * 3.14 * radius2);

		System.out.println("Perimeter of a Circle is " + circlePerimeter);

	}

	void perimeterOfRectangle(int length2, int breadth2) {
		int rectanglePerimeter = 2 * (length2 + breadth2);

		System.out.println("Perimeter of a Rectangle is " + rectanglePerimeter);

	}

	public static void main(String[] args) {

		Q4 obj = new Q4();
		obj.areaOfCircle(5);
		obj.areaOfRectangle(10, 20);
		obj.perimeterOfCircle(10);
		obj.perimeterOfRectangle(5, 10);

	}

}
