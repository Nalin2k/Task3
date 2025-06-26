package entity;

public class Book {
	String title, author, ISBN;
	boolean isIssued;
	
	public Book(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.isIssued = false;
	}

	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isIssued() {
		return isIssued;
	}
	
	public void issue() {
		isIssued = true;
	}
	
	public void returnBook() {
		isIssued = false;
	}
	
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", isIssued=" + isIssued + "]";
	}
	
}
