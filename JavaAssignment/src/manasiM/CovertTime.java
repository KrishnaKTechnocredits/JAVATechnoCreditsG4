package manasiM;

public class CovertTime 
{
	void displaytime(int seconds)
	{
				
		int min1=seconds/60;
		int sec=seconds%60;
		int hour=min1/60;
		int min=min1%60;
		
		System.out.println("Time is: "+hour+"hrs :"+min+"mins :"+sec+"seconds");
		
	}
	
	public static void main(String[] args) 
	{
		new CovertTime().displaytime(Integer.parseInt(args[0]));
	}
}
