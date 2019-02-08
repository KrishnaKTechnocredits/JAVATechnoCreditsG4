package pallavi;

import java.util.Scanner;

public class Calculator_Q4 
{
	void calculator() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double num2 = sc.nextDouble();
		System.out.println(
				"Enter add : for addition, sub : for substraction , div : for division, mul : for multiplication");
		String operation = sc.next();
		switch (operation) 
		{
		case "add":
			System.out.println("Sum is : " + (num1 + num2));
			break;

		case "sub":
			System.out.println("Substraction is :" + (num1 - num2));
			break;

		case "div":
			if (num1 > 0 && num2 > 0) {
				System.out.println("Division is : " + (num1 / num2));
			}
			break;

		case "mul":
			System.out.println("Multiplication is :" + (num1 * num2));
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

	public static void main(String[] args) 
	{
		Calculator_Q4 calculator = new Calculator_Q4();
		calculator.calculator();
	}
}
