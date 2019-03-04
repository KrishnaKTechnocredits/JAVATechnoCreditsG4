package piyushS;

import java.util.Scanner;

public class Q5_Book {

	String title;
	String bookPublisher;
	String author;

	public Q5_Book(String title, String bookPublisher, String author) {

		this.title = title;
		this.bookPublisher = bookPublisher;
		this.author = author;

	}

	void detailsOfBook() {
		System.out.println(
				"Title of the Book is " + title + ", Publisher is " + bookPublisher + " and Author is " + author);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Title, Publisher and Author names:");
		Q5_Book book = new Q5_Book(scan.nextLine(), scan.nextLine(), scan.nextLine());
		book.detailsOfBook();

	}

}
