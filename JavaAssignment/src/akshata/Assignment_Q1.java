package akshata;

public class Assignment_Q1 {

	public static void main(String[] args)
	{
		int userno1=Integer.parseInt(args[0]);
		int userno2=Integer.parseInt(args[1]);
		
		int addition=sum(userno1,userno2);
		int subtraction=sub(userno1,userno2);
		int multiplication=multiplication(userno1,userno2);
		float division=div(userno1,userno2);
		int remainder=mod(userno1,userno2);
		
		System.out.println("addition of two no is :"+addition);
		System.out.println("subtraction of two no is :"+subtraction);
		System.out.println("multiplication of two no is :"+multiplication);
		System.out.println("division of two no is :"+division);
		System.out.println("remainder of two no is :"+remainder);

	}
	static int sum(int num1,int num2)
	{
		int ans=num1+num2;
		return ans;
	}
	static int sub(int num1,int num2)
	{
		int ans=num1-num2;
		return ans;
	}
	static int multiplication(int num1,int num2)
	{
		int ans=num1*num2;
		return ans;
	}
	static float div(float num1,float num2)
	{
		float ans=num1/num2;
		return ans;
	}
	static int mod(int num1,int num2)
	{
		int ans=num1%num2;
		return ans;
	}


}
