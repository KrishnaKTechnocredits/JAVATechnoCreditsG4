package piyushS;

public class Q6 {

	void converttemperature(double celsius, double fahrenheit) {
		celsius = (float)(fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is " + celsius);
		System.out.println("Temperature in Fahrenheit is " + fahrenheit);
	}

	public static void main(String[] args) {

		Q6 obj = new Q6();
		obj.converttemperature(25.5, 77.9);

	}

}
