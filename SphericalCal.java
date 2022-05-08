//Ruben Gonzalez
//Michael Madrigal
//Cosc 1437-002
//1/27/18
//PP 3.6

import java.util.Scanner;
import java.text.DecimalFormat;

public class SphericalCal {
	public static void main(String[] args) {
		
		DecimalFormat format4 = new DecimalFormat("0.####");
		Scanner scan = new Scanner(System.in);
		
		double radius, volume, surfaceArea;
		
		final double VOL = 1.33333333333;
		
		System.out.println("Enter radius of sphere: ft.");
		radius = scan.nextInt();
		
		volume = ((VOL * Math.PI * (Math.pow(radius , 3))));
		surfaceArea = ((4 * Math.PI * (Math.pow(radius , 2))));
		
		System.out.println("Volume: " + format4.format(volume) + "ft." +
						"\nSurface Area: " + format4.format(surfaceArea) + "ft.");
	}
}