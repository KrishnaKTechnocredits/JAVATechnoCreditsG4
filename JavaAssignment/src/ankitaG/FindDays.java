package ankitaG;

import java.util.Scanner;
//Q5 from decision making and switch statement
public class FindDays {
	void findWeekDays(int number)
{
		
		if(number>7)
		{
			number=number%8;
		}
		switch(number)
		{
		case 1:
			System.out.println("its Monday");
			break;
		case 2:
			System.out.println("its Tuesday");
			break;
		case 3:
			System.out.println("its Wednesday");
			break;
		case 4:
			System.out.println("its Thursday");
			break;
		case 5:
			System.out.println("its Friday");
			break;
		case 6:
			System.out.println("its Saturday");
			break;
		case 7:
			System.out.println("its Sunday");
			break;	
		default:
			System.out.println("invalid number");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int number= scanner.nextInt();
		FindDays day= new FindDays();
		day.findWeekDays(number);
		scanner.close();
	}


}
