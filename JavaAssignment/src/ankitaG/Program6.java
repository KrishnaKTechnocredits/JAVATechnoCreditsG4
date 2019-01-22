package ankitaG;

public class Program6 {

	void temperatureConvertor(float temperatureValue) 
	{
       float celciusTem= (temperatureValue-32f)*5/9;
       System.out.println("temperature in celcius is:" +celciusTem+"^C");
	}
	public static void main(String[] args) {
		
	float temp=Float.parseFloat(args[0]);
	Program6 p6= new Program6();
	p6.temperatureConvertor(temp);
	
	}

}
