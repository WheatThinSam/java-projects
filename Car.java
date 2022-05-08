//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.5

public class Car {
	private String make, model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		make = "Not Set";
		model = "Not Set";
		year = 0;
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String val) {
		make = val;
	}
	public void setModel(String val) {
		model = val;
	}
	public void setYear(int val) {
		year = val;
	}
	
	public String toString() {
		return String.format("Car {make: %s, model: %s, year: %d}",
							make,
							model,
							year);
	}
}