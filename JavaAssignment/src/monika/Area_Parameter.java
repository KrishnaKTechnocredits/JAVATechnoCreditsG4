//// To find area and perimeter of Rectangle and circle

package monika;

public class Area_Parameter {

	static void circle(int radius) {//to find parameter and area of circle
		float pi = 3.14f;
		System.out.println("The perimeter of circle is " + (2 * pi * radius));
		System.out.println("The area of circle is " + (pi * radius * radius));
	}

	static void rectangle(int length, int width) {//to find parameter and area of rectangle
		System.out.println("The perimeter of rectangle is " + 4 * (length + width));
		System.out.println("The area of rectangle is " + (length * width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle(9);
		rectangle(10, 9);
	}

}
