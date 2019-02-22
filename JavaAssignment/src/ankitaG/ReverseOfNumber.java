package ankitaG;

public class ReverseOfNumber {
	void findReverse(int number)
	{
		int temp=0;
		System.out.println("reverse of number is");
		while(number>0)
		{
			temp=number%10;
			System.out.print(temp);
			number=number/10;	
		}		
	}
	public static void main(String[] args) {
		ReverseOfNumber reverse= new ReverseOfNumber();
		reverse.findReverse(456789);
	}


}
