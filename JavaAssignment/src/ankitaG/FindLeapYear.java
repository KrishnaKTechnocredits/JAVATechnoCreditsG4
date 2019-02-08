package ankitaG;

import java.util.Scanner;

//Q3 from decision making and switch statement
public class FindLeapYear {
	void findLeapYear(int year) {
		if (year % 4 == 0) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter year");
		int year = scanner.nextInt();
		FindLeapYear leapyear = new FindLeapYear();
		leapyear.findLeapYear(year);
		scanner.close();
	}

}
