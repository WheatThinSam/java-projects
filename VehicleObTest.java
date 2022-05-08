//Ruben Gonzalez
//Michael Madrigal
//Cosc 2
// January 3 2018

import java.util.Scanner;

public class VehicleObTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vehicle moto = new Vehicle("Ruben Samuel Gonzalez", "Yamaha", "X7", "Lime Green", 2017, 35000, 0);
		
		moto.idGen();
		System.out.println(moto);
		
		
		
	}
	
}