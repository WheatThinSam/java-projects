//Ruben Gonzalez
//ITSE-1302-002
//6/22/17
//PP 2.13

import java.util.Scanner;

public class Fractioner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		final int NUM, DEN;
		
		System.out.println("Enter fraction numerator then denominator: ");
		NUM = scan.nextInt                 ( );
		System.out.println("--      divided by:");
		DEN = scan.nextInt                 ( );
		
		System.out.println("The decimal value is: " + (float)NUM / (float)DEN);
	}
}