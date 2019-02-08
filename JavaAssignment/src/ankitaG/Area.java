package ankitaG;

import java.util.Scanner;

//Q2 from overloading section---this class takes inputs from user and calculate  area of different geometric figures.
public class Area {
	// this method calculates area of square
	void area(int side) {
		System.out.println("area of square is " + side * side);
	}

	// this method calculates area of rectangle
	void area(float breadth, float length) {
		System.out.println("area of rectangle is " + length * breadth);
	}

	// this method calculates area of circle
	void area(float radius) {
		System.out.println("area of circle is " + 3.14f * radius);
	}

	public static void main(String[] args) {
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square");
		area.area(sc.nextInt());
		System.out.println("enter radius of cirle");
		area.area(sc.nextFloat());
		System.out.println("enter length and breadth of rectangle");
		area.area(sc.nextFloat(), sc.nextFloat());
		sc.close();
	}

}
