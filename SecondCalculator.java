//Ruben Gonzalez
//Michael Madrigal
//Cosc II
//1/19/2018
//PP 2.8

import java.util.Scanner;

public class SecondCalculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final long HRS, MIN, SEC, SEC_FINAL;
		
		System.out.println("Please enter hours:");
		HRS = scan.nextLong();
		System.out.println("Now enter minutes:");
		MIN = scan.nextLong();
		System.out.println("Lastly enter seconds:");
		SEC = scan.nextLong();
		
		SEC_FINAL = (HRS * 60 * 60) + (MIN * 60) + SEC;
		System.out.println("Your time in seconds is:" + SEC_FINAL);
	}
}
