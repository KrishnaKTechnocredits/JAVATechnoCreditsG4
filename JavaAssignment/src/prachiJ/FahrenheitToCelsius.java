package prachiJ;

import prachiJ.FahrenheitToCelsius;

public class FahrenheitToCelsius {

    static void convertFToC(int f)
	{
	float c = (f-32)*(float)5/9;
	System.out.println("Temprature " + f + "F" + " to celcius is: " +c +"C");	
	}
	public static void main(String[] args) {
		
		int f = Integer.parseInt(args[0]);
		convertFToC(f);
	}

}
