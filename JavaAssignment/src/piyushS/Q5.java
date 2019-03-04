package piyushS;

import java.util.Scanner;

public class Q5 {

	void weekDayName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any weekday from 1 to 7");
		int weekDayNumber = sc.nextInt();

		if (weekDayNumber > 7) {
			weekDayNumber = weekDayNumber % 7;
		}
		switch (weekDayNumber) {

		case 1:
			System.out.println(weekDayNumber + " is Monday");
			break;

		case 2:
			System.out.println(weekDayNumber + " is Tuesday");
			break;

		case 3:
			System.out.println(weekDayNumber + " is Wednesday");
			break;

		case 4:
			System.out.println(weekDayNumber + " is Thursday");
			break;

		case 5:
			System.out.println(weekDayNumber + " is Friday");
			break;

		case 6:
			System.out.println(weekDayNumber + " is Saturday");
			break;

		case 7:
			System.out.println(weekDayNumber + " is Sunday");
			break;

		default:
			System.out.println("Such weekday doesnot exists");
			break;
		}
	}

	public static void main(String[] args) {
		Q5 weekDay = new Q5();
		weekDay.weekDayName();
	}

}
