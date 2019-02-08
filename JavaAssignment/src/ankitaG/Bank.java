package ankitaG;
//Q2 from class and object section---this class takes different types of inputs from user and perform action based on inputs.
public class Bank {

	String account_no;
	String name;
	static float amount;
	//this method saves data of user
	void insertData(String account_no,String name,float amount)
	{
		this.account_no=account_no;
		this.name=name;
		Bank.amount=amount;
		System.out.println("data saved successfully");
	}
	//this method deposit the amount entered.
	void deposit(float amount)
	{
		Bank.amount=Bank.amount+amount;
		System.out.println("amount deposited and current balance is "+ Bank.amount);
	}
	//this method withdraw the amount entered.
	void withdrawl(float amount)
	{
		Bank.amount=Bank.amount-amount;
		System.out.println("amount withdrawn and current balance is "+ Bank.amount);
	}
	//this method checks balance
	void checkBalance()
	{
		System.out.println("your current amount is "+ amount);
	}
	//this method display full details of account holder
	void displayDetails()
	{
		System.out.println("accountholder name is "+ name+", "+ "account number is "+ account_no+", "+ "amount in account is "+ Bank.amount);
	}
}
