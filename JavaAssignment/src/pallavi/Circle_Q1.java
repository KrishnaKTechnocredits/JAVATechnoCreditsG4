package pallavi;

import java.util.Scanner;

public class Circle_Q1 
{
	float radius;

	void radiusOfCircle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius = sc.nextFloat();
		System.out.println("Radius of circle is : " + radius);
	}

	void areaOfCircle() 
	{
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle is: " + area);
	}

	void circumferenceOfCircle() 
	{
		double circumference = 2 * 3.14 * radius;
		System.out.println("Circumference of circle is : " + circumference);
	}
}
