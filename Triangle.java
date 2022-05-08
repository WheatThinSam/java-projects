//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//07/6/17
//PP 3.7

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangle {
	public static void main(String[] args) {
		
		DecimalFormat format3 = new DecimalFormat("0.###");
		Scanner scan = new Scanner(System.in);
		
		double sideA, sideB, sideC, area;
		final double PERIMETER, PEMTR_S;
		
		System.out.println("Enter length of sides of triangle. \nSide A ft: ");
		sideA = scan.nextDouble();
		System.out.println("Side B: ");
		sideB = scan.nextDouble();
		System.out.println("Side C: ");
		sideC = scan.nextDouble();

		PERIMETER = (sideA + sideB + sideC);
		PEMTR_S = (.5 * PERIMETER);
		area = (Math.sqrt(PEMTR_S *(PEMTR_S - sideA) * (PEMTR_S - sideB) * (PEMTR_S - sideC)));
		
		System.out.println("Area: " + format3.format(area) +"ft.");
		
	}
}