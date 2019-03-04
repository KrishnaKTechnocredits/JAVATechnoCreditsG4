package ankitaG;

public class SumOfTwoArrays {

	int sum(int[] num)
	{
		int sum=0;
		for(int i=0; i<num.length;i++)
		{
			sum=sum+num[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfTwoArrays sum= new SumOfTwoArrays();
		int[] num1={1,5,9,3,7};
		int[] num2= {1,7,9,3};
		int sum1=sum.sum(num1);
		int sum2=sum.sum(num2);
		System.out.println("sum of two arrays is "+ (sum1+sum2));
	}
}
