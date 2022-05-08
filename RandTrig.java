//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//07/6/17
//PP 3.8

import java.util.Random;

public class RandTrig {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rand;
		double sinR, cosR, tanR;
		
		rand = (ran.nextInt(21) + 20);
		
		System.out.println("Random int: " + rand);
		
		sinR = Math.sin(rand);
		cosR = Math.cos(rand);
		tanR = Math.tan(rand);
		
		System.out.println("\nSin" + rand + " = " + sinR);
		System.out.println("Cos" + rand + " = " + cosR);
		System.out.println("Tan" + rand + " = " + tanR);
	}
}