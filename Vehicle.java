//Ruben Gonzalez
//Michael Madrigal
//Cosc II
//January 2 2018

/******************************************************************************
This is a class that can create vehicle object(s) that can edit and maintain 
the following functionalities: owner name, vehicle make, vehicle model, vehicle
color, vehicle year, vehicle's miles, and owner's user ID.
******************************************************************************/

//Imports Random class to use random objects.
import java.util.Random;

public class Vehicle {
	
	/*
	Creates instance data for the fallowing: owner name, vehicle make, vehicle model,
	vehicle color, vehicle year, vehicle's miles, and owner's user ID.
	*/
	private Random rand = new Random();
	private String ownerName, make, model, color;
	private int year, ownerId;
	private long miles;
	
	//Constructor that accepts and establishes the parameters upon instantiation.
	public Vehicle(String ownerName, String make, String model, String color, int year, long miles, int ownerId) {
		this.ownerName = ownerName;
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.miles = miles;
		this.ownerId = ownerId;
		
	}
	
	//Constructor that accepts no parameters and assigns object's values to their start up values. 
	public Vehicle() {
		ownerName = "N/A";
		make = "N/A";
		model = "N/A";
		color = "N/A";
		year = 0;
		miles = 0;
		ownerId = 00000;
		
	}
	
	//Owner name setter.
	public void setName(String val) {
		ownerName = val;
	}
	
	//Vehicle make setter.
	public void setMake(String val) {
		make = val;
	}
	
	//Vehicle model setter.
	public void setModel(String val) {
		model = val;
	}
	
	//Vehicle color setter.
	public void setColor(String val) {
		color = val;
	}
	
	//Vehicle year setter.
	public void setYear(int val) {
		year = val;
	}
	
	//Vehicle's miles setter.
	public void setMiles(long val) {
		miles = val;
	}
	
	//Owner ID random 5 digit generator.
	public void idGen() {
		ownerId = rand.nextInt(90000) + 10000;
	}
	
	//Owner ID Setter.
	public void idSet(int val) {
		ownerId = val;
	}
	
	//Owner name getter.
	public String getOwnerName() {
		return ownerName;
	}
	
	//Vehicle make getter.
	public String getVehicleMake() {
		return make;
	}
	
	//Vehicle model getter.
	public String getVehicleModel() {
		return model;
	}
	
	//Vehicle color getter.
	public String getVehicleColor() {
		return color;
	}
	
	//Vehicle year getter.
	public int getVehicleYear() {
		return year;
	}
	
	//Vehicle miles getter.
	public long getVehicleMiles() {
		return miles;
	}
	
	//Owner ID getter.
	public int getOwnerId() {
		return ownerId;
	}
	
	//Vehicle toString.
	public String toString() {
		return String.format("Vehicle {Owner Name: %s, Make: %s, Model: %s, Color: %s, Year: %d, Miles: %d, Owner Id: %d}",
							ownerName,
							make,
							model,
							color,
							year,
							miles,
							ownerId);
	}
}
