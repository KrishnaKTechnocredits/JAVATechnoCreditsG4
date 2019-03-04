package prachiJ;

import prachiJ.FahrenheitToCelsius;

public class FahrenheitToCelsius {
	/*
	 * This method is to convert temperature from Fahrenheit To Celsius
	 * @param f This is to pass Fahrenheit value to method 
	 * @return Nothing
	 */
	static void convertFahrenheitToCelsius(int fahrenheit) {
		float celcius = (fahrenheit - 32) * (float) 5 / 9;
		System.out.println("Temprature " + fahrenheit + "F" + " to celcius is: " + celcius + "C");
	}

	public static void main(String[] args) {

		int f = Integer.parseInt(args[0]);
		convertFahrenheitToCelsius(f);
	}
}
