package ankitaG;

public class Program4 {
	float length;
	float breadth;
	float areaRec;
	float radius;
	float perimeterRec;
	float areaCir;
	float perimeterCir;

	void aboutRectangle(float l, float b) {
		length = l;
		breadth = b;
		System.out.println("Area of rectangle is:" + (length * breadth));
		System.out.println("Area of rectangle is:" + (2 * (length + breadth)));
	}

	void aboutCircle(float r) {
		radius = r;
		System.out.println("Area of Circle is:" + (3.14f * (radius * radius)));
		System.out.println("Perimter of Circle is:" + (2f * 3.14f * radius));
	}

	public static void main(String[] args) {
		float length = Float.parseFloat(args[0]);
		float breadth = Float.parseFloat(args[1]);
		float radius = Float.parseFloat(args[2]);
		Program4 p4 = new Program4();
		p4.aboutCircle(radius);
		p4.aboutRectangle(length, breadth);
	}

}
