//Ruben Gonzalez
//ITSE 1302-002
//7/6/17
//PP 3.9

import java.util.Random;

public class Cylinder {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		final double PIE, VOL;
		double rad, hght, surfaceArea, volume;
		
		PIE = Math.PI;
		VOL = 2;
		hght = rand.nextInt(20) + 1;
		rad = rand.nextInt(20) + 1;
		
		volume = (PIE * (Math.pow(rad, VOL)) * hght);
		surfaceArea = (VOL * PIE * hght * rad);
		System.out.println("Radius of cylinder: " + rad + "\nHight of cylinder: " + hght);
		System.out.println("\nVolume of cylinder: " + volume);
		System.out.println("Surface Area of cylinder: " + surfaceArea);
	}
}