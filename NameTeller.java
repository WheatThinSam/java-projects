//Ruben Gonzalez
//ITSE-1302-002
//6/19/17
//PP 2.4

import java.util.Scanner;

public class NameTeller
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name? ");
		String Name; Name = scan.nextLine();
		
		System.out.println("How old are you?");
		int age; age = scan.nextInt();
		
		System.out.println("Where do you go to college?");
		scan.nextLine();
		
		String College; College = scan.nextLine();
		
		System.out.println("What's your dog's name?");
		String DogName; DogName = scan.nextLine();
		
		System.out.println("Hello my name is " + Name + " and I am " + age + " years ");
		System.out.print("old. I'm enjoying my time at " + College + ", though \nI miss my pet " + DogName + " very much!");
		
	}
}