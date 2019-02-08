package ankitaG;

public class Book {

	String Book_title;
	String Book_Publisher;
	String Book_Author;
	Book(String Book_title, String Book_Publisher, String Book_Author)
	{
		this.Book_title=Book_title;
		this.Book_Author=Book_Author;
		this.Book_Publisher= Book_Publisher;
	}
	void bookDetails()
	{
		System.out.println("Name of book is "+ Book_title+","+" author of book is "+ Book_Author+","+" publisher of book is "+ Book_Publisher);
		
	}
	
	public static void main(String[] args) {
		
		Book book= new Book("geetanjali","Tagore","abc");
		book.bookDetails();
		Book book1= new Book("stage","kalidas","xyz");
		book1.bookDetails();
	}

}
