package ankitaG;

import java.util.Scanner;

public class ArmstrongNumber {
	
	void findArmstrongNumber(int num)
	{
		int temp=0;
		int num1=num;
		int sum=0;
		int cube=0;
		while(num>0)
		{
			temp= num%10;
			num= num/10;
			cube=temp*temp*temp;
			sum=sum+cube;
			
		}
		if(sum==num1)
		{		
		System.out.println(num1+" is Armstrong number");
		}
		else
		{
			System.out.println(num1+" is not Armstrong");
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber arm= new ArmstrongNumber();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int x= sc.nextInt();
		arm.findArmstrongNumber(x);
		sc.close();
	}

}
