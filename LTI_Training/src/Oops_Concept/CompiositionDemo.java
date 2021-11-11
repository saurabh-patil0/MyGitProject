package Oops_Concept;

import java.util.ArrayList;
import java.util.List;

// part-of relationship - book and library
class Book
{
	String title;
	String author;
	
	Book(String title, String author)
	{
		 this.title = title;
		 this.author = author;
	}
}

class Library{
	private final List<Book> books;
	
	Library(List<Book> books)
	{
		this.books = books;
	}
	
	public List<Book> getTotalBooksInTheLibary() 
	{
		return books;
	}
	
	
}
public class CompiositionDemo 
{
	public static void main(String args[]) 
	{
		Book book_1 = new Book("Maths", "RS Agarwal");
		Book book_2 = new Book("Maths", "RD sharma");
		Book book_3 = new Book("Java", "Balagurusamy");
		
		List<Book> books = new ArrayList<Book>();
		books.add(book_1);
		books.add(book_2);
		books.add(book_3);
		
		Library lib = new Library(books);
		
		List<Book> booksInLibrary = lib.getTotalBooksInTheLibary();
		for(Book bk: booksInLibrary ) {
			System.out.println("Title:" + bk.title + "," 
					+ "Author:" + bk.author);
		}
}
	
}
