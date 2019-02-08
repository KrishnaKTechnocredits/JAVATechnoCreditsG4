package ankitaG;

import java.util.Scanner;

public class ClientCircle {
	public static void main(String[] args) {
		Circle circle1= new Circle();
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter radius");
		float radius= scanner.nextFloat();
		circle1.setData(radius);
		circle1.areaOfCircle();
		circle1.circumferenceOfCircle();
		scanner.close();
	}

}
