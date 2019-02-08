package ankitaG;

import java.util.Scanner;
//client class of square class
public class TestSquare {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter side of square");
		float side= scanner.nextFloat();
		Square square= new Square(side);
		square.areaOfSquare();
		scanner.close();
		
		
	}

}
