package ankitaG;

public class Factorial {
	void findFactorial(int x)
	{
		int temp=1;
		while(x>0)
		{
			temp=temp*x;
			x--;
		}
		System.out.println("factorial of given integer is "+ temp);
	}
	public static void main(String[] args) {
		Factorial fac= new Factorial();
		fac.findFactorial(5);
	}

}
