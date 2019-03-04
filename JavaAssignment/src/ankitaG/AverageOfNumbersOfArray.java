package ankitaG;

public class AverageOfNumbersOfArray {
	void findAverage(int[] num)
	{
		int sum=0;
		for(int i=0; i<num.length;i++)
		{
			sum=sum+num[i];
		}
		float avg=(float)sum/num.length;
		System.out.println("Average Of Numbers Of Array "+ avg);
	}
	public static void main(String[] args) {
		AverageOfNumbersOfArray average= new AverageOfNumbersOfArray();
		int[] num={14,32,19,14,78,36};
		average.findAverage(num);
	}

}
