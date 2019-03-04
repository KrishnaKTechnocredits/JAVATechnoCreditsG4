package ankitaG;

public class PalindromeNumber 
{ 
	static String  palnum="";
	int findreverse(int x)
	{
		int temp = 0;
		
		System.out.println("reverse number is");
		while (x > 0)
		{
			temp = x % 10;
			x = x / 10;
			System.out.print(temp);
			palnum=palnum+temp;
		}
		return Integer.parseInt(palnum);
	}
	void findpalindrome(int num,int reverseNum)
	{
		System.out.println("start");
		if (num==reverseNum)
		{
			System.out.println(num + " is palindrome number");
		}
	}	

	public static void main(String[] args) {
		PalindromeNumber pal = new PalindromeNumber();
		int revserNum=pal.findreverse(12321);
		pal.findpalindrome(12321, revserNum);
	}

}
