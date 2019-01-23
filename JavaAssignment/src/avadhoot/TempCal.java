package avadhoot;

public class TempCal 
{
	float tempcalculation(float f)
	{
		return (f-32)*5/9;
	}
	public static void main(String[] args) 
	{
		TempCal tc=new TempCal();
		float c=tc.tempcalculation(Float.parseFloat(args[0]));
		System.out.println("Temperature in celcius is "+c);
	}
}
