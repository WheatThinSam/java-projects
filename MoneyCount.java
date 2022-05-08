//Ruben Gonzalez
//Michael Madrigal
//Cosc II
//1/19/2018
//PP 2.11

import java.util.Scanner;

public class MoneyCount {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double TOTAL, TEN_BILL, FIVE_BILL, ONE_BILL, QUARTER, DIME, NICKEL, PENNY;
		double money, ten, five, one, quarter, dime, nick, penny, remainder;
		
		TEN_BILL = 10.0;
		FIVE_BILL = 5.0;
		ONE_BILL = 1.0;
		QUARTER = 0.25;
		DIME = 0.10;
		NICKEL = 0.05;
		PENNY = 0.01;
		
		System.out.print("How much money do you have?:");
		money = scan.nextDouble();
		
		ten = (double)(money / TEN_BILL);
		remainder = (double)(money % TEN_BILL);
		
		five = (double)(remainder/FIVE_BILL);
		remainder = (double)(remainder % FIVE_BILL);
		
		one = (double)(remainder / ONE_BILL);
		remainder = (double)(remainder % ONE_BILL);
		
		quarter = (double)(remainder / QUARTER);
		remainder = (double)(remainder % QUARTER);
		
		dime = (double)(remainder / DIME);
		remainder = (double)(remainder % DIME);
		
		nick = (double)(remainder / NICKEL);
		remainder = (double)(remainder % NICKEL);
		
		penny = (double)(remainder / PENNY);
		remainder = (double)(remainder % PENNY);
		
		System.out.println("you have exactly: ");
		System.out.println("Tens: " + (long)ten);
		System.out.println("Fives: " + (long)five);
		System.out.println("Ones: " + (long)one);
		System.out.println("Quarters: " + (long)quarter);
		System.out.println("Dimes: " + (long)dime);
		System.out.println("Nickels: " + (long)nick);
		System.out.println("Pennies: " + (long)penny);
		
	}
}