//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/18/17
//PP 4.3

public class Sphere {
	private double diameter;
	
	public final double VOL = 1.33333333333;
	private double radius;
	
	public Sphere(double diameter) {
		this.diameter = diameter;
	}
	
	public void setDiameter(double val) {
		diameter = val;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public double calRadius() {
		return (diameter / 2);
	}
	
	public double calSurfaceArea() {
		return ((4 * Math.PI * (Math.pow(calRadius() , 2))));
	}
	
	public double calVolume() {
		return ((VOL * Math.PI * (Math.pow(calRadius() , 3))));
	}
	
	public String toString() {
		return String.format("Sphere{diameter: %f}", diameter);
	}
}
	