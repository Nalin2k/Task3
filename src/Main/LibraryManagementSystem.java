package Main;

import entity.Book;
import entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library = new Library();
		 
		Book book1 = new Book("ISBN001", "Rich Dad Poor Dad", "Robert T. Kiyosaki");
		Book book2 = new Book("ISBN002", "The Monk Who Sold his Ferrari", "Robin Sharma");   
		
		library.addBook(book1);
		library.addBook(book2);
		
		library.issueBook("ISBN001");
		library.issueBook("ISBN002");
		
		library.returnBook("ISBN002");
	}
}
