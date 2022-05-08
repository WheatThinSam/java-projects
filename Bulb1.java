//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/11/2017
//Quiz8

public class Bulb {
	private boolean state;
	
	public Bulb() {
		state = false;
	}

	public void turnOff() {
		state = false;
	}
	
	public void turnOn() {
		state = true;
	}
	
	public boolean isOn() {
		return state;
	}
	
	public String toString() {
		return String.format("Bulb{ state: %b}", state);
	}
	
}