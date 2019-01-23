package manasiM;

public class CovertTime 
{
	void displaytime(int seconds)
	{
		int hour = 0;
		int min=0;
		int min1=0;
		int sec=0;
		
		min1=seconds/60;
		sec=seconds%60;
		hour=min1/60;
		min=min1%60;
		
		System.out.println("Time is: "+hour+"hrs :"+min+"mins :"+sec+"seconds");
		
	}
	
	public static void main(String[] args) 
	{
		new CovertTime().displaytime(Integer.parseInt(args[0]));
	}
}
