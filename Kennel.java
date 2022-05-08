//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//4.4

import java.util.Scanner;

public class Kennel {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter dog's name: ");
		myDog.setName( scan.nextLine().trim() );
		System.out.println("Enter dog's breed: ");
		myDog.setBreed( scan.nextLine().trim() );
		System.out.println("Enter dog's age: ");
		myDog.setAge( scan.nextInt() );
		
		System.out.println("\nDog name: " + myDog.getName());
		System.out.println("Dog breed: " + myDog.getBreed());
		System.out.println("Dog human age: " + myDog.calHumanAge());
		
		System.out.println("\n" + myDog);
		
		
	}
}