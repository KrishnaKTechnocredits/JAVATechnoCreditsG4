package prachiJ;

import prachiJ.ConvertSeconds;

class ConvertSeconds
{
	static void convertSecToHrs(int s)
	{
		int min=0,sec=0,hr=0;
		if (s>60)
		{
			min = s/60;
			sec = s%60;
		}
		
		if (min>60)
		{
			hr = min/60;
			min = min%60;
		}
		
		System.out.println(hr + "." + min + "." + sec);
		
	}
	public static void main(String args[])
	{
		int s = Integer.parseInt(args[0]);
		convertSecToHrs(s);
	}
}