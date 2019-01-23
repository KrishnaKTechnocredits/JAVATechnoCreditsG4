package pallavi;

public class Q7 {

	void timeConversion(int seconds) {

		int a = seconds % 60;
		int b = seconds / 60;
		int c = b % 60;
		b = b / 60;
		System.out.print(b + ":" + c + ":" + a);
		System.out.print("\n");
	}

	public static void main(String[] args) {
		new Q7().timeConversion(5000);
	}
}
