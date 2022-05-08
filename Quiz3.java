//Ruben Gonzalez
//ITSE-1302-002
//6/19/17
//quiz3

import java.util.Scanner;

public class Quiz3
{
	public static void main(String[] args)
	{
		String name;
		int age;
		float hgrade1, hgrade2;
		final int HOME_AVERAGE = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your full name?: ");
		name = scan.nextLine();
		
		System.out.println("How old are you?: ");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter 2 homework grades: ");
		hgrade1 = scan.nextFloat();
		hgrade2 = scan.nextFloat();
		
		float average = (((hgrade1 + hgrade2)/HOME_AVERAGE));	
		
		System.out.println("Your name is " + name + " you are " + age + 
							" and your homework average is: " + average);
	}
}