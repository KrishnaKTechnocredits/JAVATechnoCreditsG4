package ankitaG;

import java.util.Scanner;

public class BankClient {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter accountnumber, name, initial amounts");
		Bank bank=new Bank();
		bank.insertData(scanner.next(), scanner.next(), scanner.nextFloat());
		System.out.println("enter operation to be performed");
		String operation=scanner.next();
		

		switch(operation)
		{
		case "deposit":
			System.out.println("enter deposit amount");
			float depositAmount=scanner.nextFloat();
			bank.deposit(depositAmount);			
			break;
		case "withdrawl":
			System.out.println("enter withdrawl amount");
			float withdrawAmount=scanner.nextFloat();
			bank.withdrawl(withdrawAmount);			
			break;
		case "checkbalance":
			bank.checkBalance();
			break;
		case "viewdetails":
			bank.displayDetails();
			break;
		default:
			System.out.println("operation performed");
		}
		scanner.close();

		
	}

}
