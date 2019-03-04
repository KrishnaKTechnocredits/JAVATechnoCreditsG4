package manasiM;


public class TempCalc 
{
	
	float coverttemp(float f)
	{
		return (f-32)*5/9;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Temperature is "+new TempCalc().coverttemp(Float.parseFloat(args[0]))+" Celsius");
	}
}
