//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//Quiz8

public class Lights {
	public static void main(String[] args) {
		Bulb bulb = new Bulb();
		
		System.out.println("Is bulb on? " + bulb.isOn());
		
		bulb.turnOn();
		
		System.out.println("Is bulb on? " + bulb.isOn());
		
	}
}
