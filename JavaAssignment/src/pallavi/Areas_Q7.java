package pallavi;

import java.util.Scanner;

public class Areas_Q7 
{
	Scanner sc;

	int areaOfRectangle() 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length = sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int breadth = sc.nextInt();
		int area = length * breadth;
		return area;
	}

	int areaOfTriangle() 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter base of triangle");
		int base = sc.nextInt();
		System.out.println("Enter height of triangle");
		int height = sc.nextInt();
		int area = 1 / 2 * (base * height);
		return area;
	}

	double areaOfCircle() 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius = sc.nextInt();
		double area = 3.14 * radius * radius;
		return area;
	}

	void geometricAreas() 
	{
		sc = new Scanner(System.in);
		System.out.println("Press menu");
		int pressNumber = sc.nextInt();
		switch (pressNumber) 
		{

		case 1:
			System.out.println("Area of rectangle is : " + areaOfRectangle());
			break;

		case 2:
			System.out.println("Area of triangle is : " + areaOfTriangle());
			break;

		case 3:
			System.out.println("Area of circle is : " + areaOfCircle());
			break;

		default:
			System.out.println("No such geometric area exists");
		}
	}

	public static void main(String[] args) 
	{
		Areas_Q7 area = new Areas_Q7();
		area.geometricAreas();
	}
}
