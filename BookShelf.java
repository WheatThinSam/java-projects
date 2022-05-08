//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.5

public class BookShelf {
	public static void main(String[] args) {
	
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 2104);
		Book book2 = new Book("Brave New World", "Aldous Hucksley", "Harper Perennial", 1932);
		Book book3 = new Book("This Darkness", "Frank E. Peretti", "Tyndale Momentum", 1986);
		
		book3.setTitle("This Present Darkness");
		book2.setAuthor("Aldous Huxsley");
		book1.setCopyRightDate(2004);
		
		System.out.println(book1);
		System.out.println("\n" + book2);
		System.out.println("\n" + book3);
	}
}

		