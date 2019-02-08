package ankitaG;

import java.util.Scanner;

public class Calculator {
	void performDesiredOperation(int num1, int num2, String operation)
	{
		switch(operation)
		{
		case "addition":
			int sum=num1+num2;
			System.out.println("addition is "+ sum);
			break;
		case "minus" :
			int sub=num1-num2;
			System.out.println("addition is "+ sub);
			break;
		case "multiplication" :
			int mul=num1*num2;
			System.out.println("addition is "+ mul);
			break;
		case "division" :
			int div=num1/num2;
			System.out.println("addition is "+ div);
			break;
		default:
			System.out.println("not a valid operation");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1= scanner.nextInt();
		int num2= scanner.nextInt();
		System.out.println("enter operation to be performed");
		String operation= scanner.next();
		Calculator cal= new Calculator();
		cal.performDesiredOperation(num1, num2, operation);
		scanner.close();
	}

}
