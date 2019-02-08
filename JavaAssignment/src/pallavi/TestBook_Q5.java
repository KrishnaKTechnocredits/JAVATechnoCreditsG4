package pallavi;

public class TestBook_Q5 
{
	public static void main(String[] args) 
	{
		System.out.println("First book details are as follows: ");
		Book_Q5 book1 = new Book_Q5("Be simple", "Shrivastava House", "Pallavi");
		book1.detailsOfBook();
		System.out.println("Second book details are as follows: ");
		Book_Q5 book2 = new Book_Q5("Dream big", "Shrivastava Publications", "Pallavi Shrivastava");
		book2.detailsOfBook();
	}
}
