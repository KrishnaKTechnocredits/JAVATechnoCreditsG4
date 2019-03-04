package ankitaG;

public class MaxLengthString {
	void maxLengthStringFromArray(String[] statements)
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
	}
	public static void main(String[] args) {
		MaxLengthString ml=new MaxLengthString();
		String[] str={"all the best", "technocredits","", "maharashtra"};
		ml.maxLengthStringFromArray(str);
	}

}
