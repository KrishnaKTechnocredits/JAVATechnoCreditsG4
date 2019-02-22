package ankitaG;

public class FrequencyOfCharInString {
	int count;
	void frequencyOfCharInString(String str,char ch)
	{
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)==ch)
			{
				count=count++;
			}
		}
		System.out.println(" frequency of character "+ch+" in string is "+ count);
	}
	public static void main(String[] args) {
		FrequencyOfCharInString freq= new FrequencyOfCharInString();
		freq.frequencyOfCharInString("electrical engineering", 'e');
	}

}
