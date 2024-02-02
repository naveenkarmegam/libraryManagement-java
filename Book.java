package libraryManagement;

public class Book {
	String title;
	String author;
	int publicationYear;
	public Book(String title,int publicationYear, String author) {
		this.title = title;
		this.publicationYear = publicationYear;
		this.author = author;
	}
	
	public String toString() {
		return "User: " + title + "Age: " + publicationYear + "Department: " + author; 
	}
}
