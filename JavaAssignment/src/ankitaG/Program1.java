package ankitaG;

public class Program1 
{
	
	int addition(int num1, int num2)
	{
		int sum=num1+num2;
		return sum;
	}
	int subtract(int num1, int num2)
	{
		int sub =num1-num2;
		return sub;
	}
	int multiply(int num1, int num2)
	{
		int mul=num1*num2;
		return mul;
	}
	int divide (int num1, int num2)
	{
		int div=num1/num2;
		return div;
	}
	int module(int num1, int num2)
	{
		int mod= num1%num2;
		return mod;
	}
	public static void main(String[] args)
	{
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		Program1 p1= new Program1();
		int sum=p1.addition(num1,num2);
		int sub=p1.subtract(num1,num2);
		int mult=p1.multiply(num1,num2);
		int div= p1.divide(num1,num2);
		int mod=p1.module(num1,num2);
		System.out.println(" sum is:"+sum +" "+"\n substraction is: "+ sub +" "+"\n multiplication is: "+ mult+" "+"\n division is: "+ div+" "+"\n mod is: "+ mod);
	}

}
