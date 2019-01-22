package ankitaG;

public class Program7 {

	void conversionOfSecond(int seconds)
	{
		int minute = seconds / 60;
		int second = seconds % 60;
		int hour = 0;
		if (minute >= 60) 
		{
			hour = minute / 60;
			minute = 0;
			System.out.println("the conversion of seconds into HH:MM:SS format is: " + hour + "H :" + minute + "M :"+ second + "S");
		} 
		else
		{
			System.out.println("the conversion of seconds into HH:MM:SS format is: " + hour + "H :" + minute + "M :"+ second + "S");
		}
	}

	public static void main(String[] args)
	{
		int seconds = Integer.parseInt(args[0]);
		Program7 p7 = new Program7();
		p7.conversionOfSecond(seconds);
	}
}
