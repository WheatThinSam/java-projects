//Ruben Gonzalez
//Michael Madrigal
//ITSE-1302-002
//07/5/17
//PP 3.4

import java.util.Scanner;

public class RoundFloat {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numb;
		double rounded;
		
		System.out.println("Enter a floating point number: ");
		numb = scan.nextDouble();
		
		rounded = (Math.round(numb));
		
		System.out.println("Rounded: " + rounded + "\b\b");
	}
}