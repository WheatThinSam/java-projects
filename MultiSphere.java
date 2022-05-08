//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/18/17
//PP 4.3

public class MultiSphere {
	public static void main(String[] args) {
		Sphere sphr1 = new Sphere(1.0);
		Sphere sphr2 = new Sphere(2.0);
		Sphere sphr3 = new Sphere(3.0);
		
		sphr1.setDiameter(2.5);
		sphr2.setDiameter(3.0);
		sphr3.setDiameter(4.5);
		
		System.out.println(sphr1.getDiameter());
		System.out.println(sphr2.getDiameter());
		System.out.println(sphr3.getDiameter());
		
		System.out.println("\n" + sphr1.calVolume());
		System.out.println(sphr2.calVolume());
		System.out.println(sphr3.calVolume());
		
		System.out.println("\n" + sphr1.calSurfaceArea());
		System.out.println(sphr2.calSurfaceArea());
		System.out.println(sphr3.calSurfaceArea());
		
		System.out.println("\n" + sphr1);
		System.out.println(sphr2);
		System.out.println(sphr3);
	}
}
