package prachiJ;

import prachiJ.AreaPerimeterFind;

public class AreaPerimeterFind {

	void rectangle(float a,float b)
	{
		double perimeter = 2*(a+b);
		double area = (a*b);
		System.out.println("---------------Rectangle-----------------");
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}
	
	void circle(float r)
	{
	    double perimeter = 2.0*((float)22/7)*r;
	    double area =((float)22/7)*r*r;	
		System.out.println("---------------Circle-----------------");
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}
	
	
	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float r = Float.parseFloat(args[2]);
		
		AreaPerimeterFind ap = new AreaPerimeterFind();
		ap.rectangle(a,b);
		ap.circle(r);
	}

}
