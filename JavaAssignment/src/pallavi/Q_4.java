package pallavi;

//WAP to find the area and perimeter of Rectangle & Circle

public class Q_4 {

	double pi = 3.14;

	void areaRectangle(int l, int b) {
		int area = l * b;
		System.out.println("Area of rectangle is " + area);
	}

	void perimeterRectangle(int l, int b) {
		int perimeter = 2 * (l + b);
		System.out.println("Perimeter of rectangle is " + perimeter);
	}

	void areaCircle(double r) {
		double area = (pi * r * r);
		System.out.println("Area of circle is " + area);
	}

	void perimeterCircle(double r) {
		double perimeter = (2 * pi * r);
		System.out.println("Perimeter of circle is " + perimeter);
	}

	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);
		double radius = Double.parseDouble(args[2]);
		Q_4 q = new Q_4();
		q.areaRectangle(length, breadth);
		q.perimeterRectangle(length, breadth);
		q.areaCircle(radius);
		q.perimeterCircle(radius);
	}
}
