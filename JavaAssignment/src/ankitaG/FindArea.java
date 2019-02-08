package ankitaG;

import java.util.Scanner;

//Q7 from decision making and switch statement section
public class FindArea {
	void findArea(float length, float breadth, float radius, String type)
	{
		switch (type)
		{
		case "rectangle":
			float RArea=length*breadth;
			System.out.println("area of rectangle is: "+ RArea);
			break;
		case "circle":
			float CArea=3.14f*radius*radius;
			System.out.println("area of circle is: "+ CArea);
			break;
		case "triangle":
			float TArea=0.5f*length*breadth;
			System.out.println("area of tringle is: "+ TArea);
			break;		
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter three numbers");
		float length= scanner.nextInt();
		float breadth= scanner.nextInt();
		float radius= scanner.nextInt();
		System.out.println("enter for which area needs to be calculated");
		String type=scanner.next();
		FindArea area= new FindArea();
		area.findArea(length,breadth,radius, type);
		scanner.close();
	}

}
