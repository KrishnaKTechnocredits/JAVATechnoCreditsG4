// convert temprature from fahreniet to celsius

package monika;

public class FahrenietToCelsius {
	
	static void tempconversion(int f)//conversion from farheneit to celsius
	{
		float c = (float)(f-32)*5/9;
		System.out.println("the value in celsius is " +c+ " degrees");
		
	}

	public static void main(String[] args) {
		
		tempconversion(80);
	}

}
