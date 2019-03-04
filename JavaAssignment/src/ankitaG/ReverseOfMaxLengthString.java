package ankitaG;

public class ReverseOfMaxLengthString {
	String maxLengthStringFromArray(String[] statements)
	{
		int maxlength=0;
		String str="null";
		for(int index=0; index<statements.length; index++)
		{
			int length=statements[index].length();
			if(maxlength<length)
			{
				maxlength=length;
				str=statements[index];
			}
			
		}
		System.out.println("maximum length string is " + str+" with length "+ maxlength);
		return str;
	}
	void findReverse(String str)
	{
		System.out.println("reverse of String is");
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			System.out.print(c);
		}
		
	}
	public static void main(String[] args) {
		ReverseOfMaxLengthString reverse= new ReverseOfMaxLengthString();
		String[] str={"all the best", "technocredits","", "maharashtra"};
		String str1=reverse.maxLengthStringFromArray(str);
		reverse.findReverse(str1);
		
	}

	


}
