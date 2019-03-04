package ankitaG;

public class SumofDigitsOfANumber {
	void findSumofDigitsOfANumber(int number)
	{
		int temp=0;
		int sum=0;
		while(number>0)
		{
			temp=number%10;
			sum=sum+temp;
			number=number/10;	
		}
		System.out.println("sum of all digits of a number is: "+ sum);
		
	}
	public static void main(String[] args) {
		SumofDigitsOfANumber sum=new SumofDigitsOfANumber();
		sum.findSumofDigitsOfANumber(159753);
	}

}
