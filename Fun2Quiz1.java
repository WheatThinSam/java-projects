//Ruben Gonzalez 
//Michael Madrigal
//Cosc 1437-002
//1/22/2018
//Quiz1

import java.util.Scanner;


public class Fun2Quiz1 {
	public static void main(String[] args) {
		int num1, num2, sum, product;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input 2 numbers \n1st Number:" );
		num1 = scan.nextInt();
		
		System.out.println("2nd Number:");
		num2 = scan.nextInt();
		
		sum = (num1 + num2);
		product = (num1 * num2);
		
		System.out.println("The sum of your numbers is: " + sum +
				"\nThe product of your numbers is: " + product);
		
	}
}
