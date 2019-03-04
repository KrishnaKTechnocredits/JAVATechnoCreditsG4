package prachiJ;

import prachiJ.AreaPerimeterFind;

public class AreaPerimeterFind {
	/*
	 * This method is used to find area and perimeter of rectangle.
	 * @param a This is the first parameter to areaPerimeterOfRectangle method
	 * @param b This is the second parameter to areaPerimeterOfRectangle method
	 * @return Nothing
	 */
	void areaPerimeterOfRectangle(float a, float b) {
		double perimeter = 2 * (a + b);
		double area = (a * b);
		System.out.println("---------------Rectangle-----------------");
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}

	/*
	 * This method is used to find area and perimeter of circle.
	 * @param r This is passing radius to areaPerimeterOfCircle method
	 * @return Nothing
	 */
	void areaPerimeterOfCircle(float r) {
		double perimeter = 2.0 * ((float) 22 / 7) * r;
		double area = ((float) 22 / 7) * r * r;
		System.out.println("---------------Circle-----------------");
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}

	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float r = Float.parseFloat(args[2]);
		AreaPerimeterFind ap = new AreaPerimeterFind();
		ap.areaPerimeterOfRectangle(a, b);
		ap.areaPerimeterOfCircle(r);
	}
}
