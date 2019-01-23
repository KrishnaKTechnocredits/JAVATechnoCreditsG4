package pallavi;
// Write a Java program to convert temperature from Fahrenheit to Celsius degree

public class Q_6 {

	void temperature(float fahrenheit) {
		float celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celcius is " + celcius + " degrees");
	}

	public static void main(String[] args) {
		float fahrenheit = Float.parseFloat(args[0]);
		Q_6 q = new Q_6();
		q.temperature(fahrenheit);
	}
}
