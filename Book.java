//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.5

public class Book {
	private String title, author, publisher;
	private int copyRD;
	
	public Book(String title, String author, String publisher, int copyRD) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyRD = copyRD;
	}
	
	public Book() {
		title = "Not Set";
		author = "Not Set";
		publisher = "Not Set";
		copyRD = 0;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getCopyRightDate() {
		return copyRD;
	}
	
	public void setTitle(String val) {
		title = val;
	}
	public void setAuthor(String val) {
		author = val;
	}
	public void setPublisher(String val) {
		publisher = val;
	}
	public void setCopyRightDate(int val) {
		copyRD = val;
	}
	
	public String toString() {
		return String.format("Book {\ntitle: %s\nauthor: %s \npublisher: %s \ncopyRD: %d}",
							title,
							author,
							publisher,
							copyRD);
	}
}