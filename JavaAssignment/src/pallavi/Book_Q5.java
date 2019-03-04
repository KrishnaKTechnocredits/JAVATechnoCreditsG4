package pallavi;

public class Book_Q5 
{
	String bookTitle;
	String bookPublisher;
	String author;

	public Book_Q5(String title, String publisher, String author) 
	{
		this.bookTitle = title;
		this.bookPublisher = publisher;
		this.author = author;
	}

	void detailsOfBook() 
	{
		System.out.println(bookTitle + " has been published by " + bookPublisher + " and its author is " + author);
	}
}
