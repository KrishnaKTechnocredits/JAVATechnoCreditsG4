package prachiJ.Assingment5.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Q12_CheckForWordPalindrome {
	
	public static void main(String[] args) {
		Q12_CheckForWordPalindrome checkForWordPalindrome = new Q12_CheckForWordPalindrome();
		checkForWordPalindrome.CheckIfWordIsPalindrome();
	}
	
	/*
	 * Description : This method tells if user entered word in palindrome or not
	 * @param : Nothing
	 * @return : Nothing
	 */
	void CheckIfWordIsPalindrome()
	{
		System.out.println("Enter a word");
		ArrayList<String> al = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		int length = word.length();
		al.add(word);
		String rev = "";
		for(int i = length-1 ; i >= 0 ; i--)
		{
			rev = rev + al.get(0).charAt(i);
		}
		System.out.println(rev);	
		if(word.equals(rev))
		{
			System.out.println(rev +" is a Pallindrome");
		}
		else
		{
			System.out.println(rev +" is not a Pallindrome");
		}
		scanner.close();
	}
}
