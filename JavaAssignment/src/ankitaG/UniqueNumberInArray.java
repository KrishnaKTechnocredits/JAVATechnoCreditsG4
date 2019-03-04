package ankitaG;

public class UniqueNumberInArray {
	
	static int j=0;
	static int[] num1= {1,2,3,4,2,5};
	static int[] num2= {5,6,7,8,9,7};
	static int[] result=new int[num1.length+num2.length];
	int[] findUnique(int[] result, int temp)
	{
		boolean flag= false;
		int i=0;
		for( i=0; i<result.length;i++)
		{
			if(result[i]==temp)
			{
				
				flag= true;
				break;
			}
			
		}
		if(flag==false)
		{
			result[j]=temp;
			j++;
		}
		return result;
	}
	
	void display(int[] result)
	{
		for(int i=0; i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		UniqueNumberInArray unique= new UniqueNumberInArray();
		for(int i=0; i<num1.length;i++ )
		{
			result=unique.findUnique(result, num1[i]);
		}
		for(int j=0; j<num2.length;j++)
		{
			result=unique.findUnique(result, num2[j]);
		}
		unique.display(result);
	}

}
