package piyushS;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Shape for which area needs to be determined");
		String operation = scan.next();

		switch (operation) {
		case "Rectangle":
			System.out.println("Enter length of Rectangle");
			int length = scan.nextInt();
			System.out.println("Enter breadth of Rectangle");
			int breadth = scan.nextInt();
			System.out.println("Area of rectangle is " + (length * breadth));
			break;

		case "Circle":
			System.out.println("Enter radius of circle");
			int radius = scan.nextInt();
			System.out.println("Area of circle is " + (3.14 * radius * radius));
			break;

		case "Triangle":
			System.out.println("Enter base of Triangle");
			int base = scan.nextInt();
			System.out.println("Enter height of Triangle");
			int height = scan.nextInt();
			System.out.println("Area of Triangle is " + ((base*height)/2));
			break;

		}
	}

}
