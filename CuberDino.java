//Ruben Gonzalez
//Michael Madrigal
//ITSE-1302-002
//07/01/17
//PP 3.2

import java.util.Scanner;

public class CuberDino {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numb1, numb2, cube1, cube2;
		
		System.out.println("Give me two numbers. (no decimals)");
		System.out.println("Number 1: ");
		numb1 = scan.nextInt();
		
		System.out.println("Number 2: ");
		numb2 = scan.nextInt();
		
		cube1 = (int)(Math.pow(numb1,3));
		cube2 = (int)(Math.pow(numb2,3));
		
		System.out.println("The sums of both cubes are: \n"
							 + "Number 1 cubed: " + (int)cube1 +
							 "\n" + "Number 2 cubed: " + (int)cube2);

	}
}