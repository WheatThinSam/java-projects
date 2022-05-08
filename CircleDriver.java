//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//Quiz7

import java.util.Scanner;

public class CircleDriver {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Circle circle = new Circle(1f);
		
		
		System.out.println("Enter radius of circle: ");
		circle.setRadius( scan.nextDouble() );

		System.out.println(circle);
		
		System.out.println("\nArea: " + circle.calculateArea() + "\nCurcumference: " + circle.calculateCurcumference() +
							"\nDiameter: " + circle.getDiameter());
							
	}
}