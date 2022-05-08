//Ruben Gonzalez
//Michael Madrigal
//Cosc II
//1/19/2018
//PP 3.1

import java.util.Scanner;
import java.util.Random;

public class UserNamer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		final String FIRST_NAME, LAST_NAME, USER_NAME;
		final int RANDOM;
		
		System.out.println("What's your first name? ");
		FIRST_NAME = scan.nextLine();

		System.out.println("What's your last name? ");
		LAST_NAME = scan.nextLine();

		USER_NAME = (FIRST_NAME.substring(0,1)) + (LAST_NAME.substring(0,5));

		RANDOM = (rand.nextInt(90)+10);
		System.out.println("Your username is: " + USER_NAME.toLowerCase() + RANDOM);
	}
}
