//Ruben Gonzalez
//ITSE-1302-002
//6/20/17
//PP 2.8

import java.util.Scanner;

public class Squared
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		final int AREA, PERIMETER;
		int side;
		
		PERIMETER = 4;
		
		System.out.println("Enter the length of one side of square.");
		System.out.println("ft: ");
		side = scan.nextInt();
		
		AREA = side;
		
		System.out.println("The area of the square is: " + (side * AREA) + ("ft."));
		System.out.println("The perimeter of the square is: " + (side * PERIMETER) + ("ft."));
		
	}
}