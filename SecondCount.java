//Ruben Gonzalez
//ITSE-1302-002
//6/20/17
//PP 2.8

import java.util.Scanner;

public class SecondCount
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int Hrs;
		int Min;
		int Sec;
		
		System.out.println("type amount of time in hours minutes and seconds: ");
		System.out.print("Hours:\n");
		Hrs = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Minutes:");
		Min = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Seconds:");
		Sec = scan.nextInt();
		
		System.out.println("Amount of seconds: " + (((Hrs*60)*60) + (Min*60) + (Sec)));
	}
}