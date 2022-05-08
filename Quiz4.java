//Ruben Gonzalez
//ITSE-1302-002
//6/22/17
//PP 2.12

import java.util.Scanner;

public class Quiz4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		final String USER_NAME;
		String fname, lname;
		
		System.out.println("What is your first name?: ");
		fname = scan.nextLine();
		
		System.out.println("What is your last name?: ");
		lname = scan.nextLine();
		
		USER_NAME = fname.substring(0,1) + lname.substring(0,5) + "25";
		
		System.out.println("your username is: " + USER_NAME.toLowerCase());
		
	}
}