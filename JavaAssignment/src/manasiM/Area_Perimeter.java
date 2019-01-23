package manasiM;

public class Area_Perimeter 
{
	void circle(float redius)
	{
		System.out.println("Area of Circle: "+(3.14*redius*redius));
		System.out.println("Perimeter of Circle: "+(2*3.14*redius));
	}
	
	void rectangle(float l, float w)
	{
		System.out.println("Area of Rectangle: "+(l*w));
		System.out.println("Perimeter of Rectangle: "+(2*(l+w)));
	}
	
	public static void main(String[] args) 
	{
	
		Area_Perimeter obj1= new Area_Perimeter();
		obj1.circle(Float.parseFloat(args[0]));
		obj1.rectangle(Float.parseFloat(args[1]),Float.parseFloat(args[2]));
		
	}
	
	
	
}
