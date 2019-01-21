//convert seconds to hour, minute and seconds.

package monika;

public class TimeConversion {

	static void timeconv(int S1) {
		int Hour = S1 / 3600;
		int S2 = S1 % 3600;
		int Minute = S2 / 60;
		int Seconds = S2 % 60;
		System.out.println(+Hour + "Hours & " + Minute + " minutes & " + Seconds + " Seconds");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeconv(7000);
	}

}
