//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.5

public class CarTest {
	public static void main(String[] args) {
		
		Car tundra1 = new Car("Toyota", "Tundra", 2012);
		Car mazda1 = new Car("Mazda", "626", 1999);
		Car nissan1 = new Car("Nissan", "Altima", 2008);
		
		tundra1.setYear(2009);
		mazda1.setModel("3");
		nissan1.setMake("Nissin");
		nissan1.setModel("RamenNoodle");
		
		System.out.println(tundra1);
		System.out.println(mazda1);
		System.out.println(nissan1);
	}
}