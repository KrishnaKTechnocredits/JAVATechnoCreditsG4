package avadhoot;

public class AreaPerimeter 
{
	void circle(int r)
	{
		System.out.println("Area of circle is "+(3.14*r*r));
		System.out.println("Perimeter of circle is "+(2*3.14*r));
	}
	void rectangle(int l,int w)
	{
		System.out.println("Area of rectangle is "+(l*w));
		System.out.println("Perimeter of circle is "+(2*(l+w)));
	}
	public static void main(String[] args) 
	{
		AreaPerimeter ap=new AreaPerimeter();
		ap.circle(Integer.parseInt (args[0]));
		ap.rectangle(Integer.parseInt (args[1]),Integer.parseInt (args[2]));
	}
}
