//Ruben Gonzalez
//Michael Madrigal
//Cosc 1347-002
//1/26/18
//PP 3.5

import java.util.Scanner;

public class DistanceToPro {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x1, y1, x2, y2;
		final int POINT_1_SUB_X, POINT_2_SUB_Y;
		
		System.out.println("Enter 2 points. \nPoint 1 (X) coordinate x1: ");
		x1 = scan.nextInt();
		System.out.println("point 1 (Y) coordinate y1: ");
		y1 = scan.nextInt();
		System.out.print("Point 2 (X) coordinate x2: \n");
		x2 = scan.nextInt();
		System.out.println("Point 2 (Y) coordinate y2: ");
		y2 = scan.nextInt();
		
		POINT_1_SUB_X = (x2 - x1);
		POINT_2_SUB_Y = (y2 - y1);
		
		final double DISTANCE = Math.sqrt(Math.pow(POINT_1_SUB_X , 2) + Math.pow(POINT_2_SUB_Y , 2));
		
		System.out.println("Distance between point 1 and point 2 = "	+ DISTANCE);
	}
}
		