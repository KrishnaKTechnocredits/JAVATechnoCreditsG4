package ankitaG;

public class FindVowelsInString {
	static int count=0;
	void findVowelsInString(String str)
	{ 
		char c;
		str=str.toLowerCase();
		for(int i=0; i<str.length();i++)
		{
			 c=str.charAt(i);
			 switch(c)
			 {
			 case 'a':
				 count++;
				 break;
			 case 'e':
				 count++;
				 break;
			 case 'i':
				 count++;
				 break;
			 case 'o':
				 count++;
				 break;
			 case 'u':
				 count++;
				 break;
			 }
			 
		}
		System.out.println("count of vowels is "+ count);
		
	}
	public static void main(String[] args) {
		FindVowelsInString vowel=new FindVowelsInString();
		vowel.findVowelsInString("automation engineering");
	}

}
