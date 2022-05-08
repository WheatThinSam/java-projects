//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/13/17
//PP 4.1

public class CountDriver {
	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c2.click();
		c2.click();
		c2.click();
		c2.click();
		
		System.out.println("Count 2: " + c2.getCount());
		
		System.out.println(c1);
		
		c1.click();
		
		System.out.println("Count 1: " + c1.getCount());
		
		c1.click();
		
		System.out.println("Count 1: " + c1.getCount());
		
		c1.reset();
		
		System.out.println("Count 1: " + c1.getCount());
	}
}