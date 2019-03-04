package ankitaG;

import java.util.Scanner;

public class VerifyPalindrome {
	static String  palnum="";
	String findreverse(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			palnum=palnum+c;
		}
		return palnum;
		
	}
	void findpalindrome(String str,String palnum)
	{
		System.out.println("start");
		if (str.equals(palnum))
		{
			System.out.println(str + " is palindrome ");
		}
		else
		{
			System.out.println(str + " is not palindrome ");
		}
	}	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		VerifyPalindrome pal = new VerifyPalindrome();
		String palnum=pal.findreverse(str);
		pal.findpalindrome(str, palnum);
		sc.close();
	}

}
