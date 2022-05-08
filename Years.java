//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/27/17
//PP 5.2

import java.util.Scanner;

public class Years {
	public static void main(String[] args) {
		
		int year = 0; 
		boolean endProgram = false;
		Scanner scan = new Scanner(System.in);
		
		while (endProgram == false) {
			System.out.println("Enter year or -1 to endProgram: ");
			year = scan.nextInt();
		if (year != -1) {
			if (year >= 1582) {
		} else System.out.println("\nEnter values above 1582: "); 
		if (year >= 1582) {
			if ((year % 4 == 0) || (year % 100 == 0) && (year % 400 != 0)) {
			System.out.println("\n" + year + " is a leap year.");
		} else System.out.println("\n" + year + " is not a leap year.");
		} else endProgram = true;
		} else endProgram = true;
		}
		System.out.println("End of Program.");
	}
}

