//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//Quiz7

public class Circle {
	private double radius;
			
		
	public Circle(double val) {
		radius = val;
	}
	
	public void setRadius(double val) {
		if (val >= 0 ) {
		radius = val;
		}
	}
	
	public double getRadius() {
		return radius;
		
	}
	public String toString() {
		return String.format("Circle{ radius: " + radius + " }");
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double calculateCurcumference() {
		return (2 * Math.PI * radius);
	}
	
	public double calculateArea() {
		return (Math.PI * (Math.pow(radius,2)));
	}
}