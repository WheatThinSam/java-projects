//Ruben Gonzalez
//ITSE-1302-002
//6/19/17
//PP 2.10

import java.util.Scanner;

public class CoinCounter
{
	public static void main(String[] args)
	{
		double quarters, dimes, nickels, pennies;
		final double QAMOUNT, DAMOUNT, NAMOUNT, TOTAL, DOLLARS, CENTS;		
		QAMOUNT = 25;
		DAMOUNT = 10;
		NAMOUNT = 5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many quarters do you have?: ");
		quarters = scan.nextInt();
		scan.nextLine();
		
		System.out.println("How many dimes do you have?: ");
		dimes = scan.nextInt();
		scan.nextLine();
		
		System.out.println("How many nickels do you have?: ");
		nickels = scan.nextInt();
		scan.nextLine();
		
		System.out.println("How many pennies do you have?: ");
		pennies = scan.nextInt();
		
		TOTAL = quarters*QAMOUNT + dimes*DAMOUNT + nickels*NAMOUNT + pennies;
		
		DOLLARS = TOTAL / 100;
		CENTS = TOTAL % 100;
		
		System.out.println("You have " + (int)DOLLARS + " Dollars and " + (int)CENTS + " Cents!");
	}
}