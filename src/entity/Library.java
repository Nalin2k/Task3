package entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added: "+ book.toString());
	}
	
	public void issueBook(String ISBN) {
		for(Book b : books) {
			if(b.getISBN().equals(ISBN) && !b.isIssued()) {
				b.issue();
				System.out.println("Issued:	" + b.toString());
				return;
			}
		}
		System.out.println("Book not available or already issued");
	}
	
	public void returnBook(String ISBN) {
		for(Book b : books) {
			if (b.getISBN().equals(ISBN) && b.isIssued()) {
				b.returnBook();
				System.out.println("Book Returned: " + b.toString());
				return;
			}
		}
		System.out.println("Book not found or was not issued");
	}


}
