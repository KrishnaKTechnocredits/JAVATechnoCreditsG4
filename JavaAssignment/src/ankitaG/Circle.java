package ankitaG;
//Q1 from class and object section---
public class Circle {
	float radius;
	void setData(float radius)
	{
		this.radius=radius;
		
	}
	void areaOfCircle()
	{
		float cArea= 3.14f*radius*radius;
		System.out.println("Area of circle is "+cArea);
	}
	void circumferenceOfCircle()
	{
		float circumference= 2*3.14f*radius;
		System.out.println("circumference of circle is "+ circumference);
	}

}
