//Ruben Gonzalez
//Michael Madrigal
//Cosc II
//Dec 29 2017

import java.util.Scanner;

public class PracticeProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[10];
		System.out.println("Enter 10 names.\nName 1:");
		names[1] = scan.nextLine();
		
		System.out.println("your name is " + names[1]);
		
	}
}
