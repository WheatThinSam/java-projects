//Ruben Gonzalez
//Michael Madrigal
//Cosc 1347
//1/24/18
//Quiz2

public class Coin {

	private boolean Coin, isHeads;
	
	
	public Coin() {
		isHeads = false;
	}
	
	public boolean getIsHeads() {
		if(isHeads == true) {
			System.out.println("lucky you!! You got heads.");
		} else {
			System.out.println("Sorry!! you got tails noob.");
		}
		return isHeads;
	}
	
	public void setIsHeads(boolean val) {
			isHeads = val;
	}
	
	public void flip() {
		int numRan;
		numRan = (int)((Math.random()* 2) + 1);
		if (numRan == 1) {
			isHeads = true;
		} else {
			isHeads = false;
		}
	}
	
	public String toString() {
		return String.format("Coin{isHeads: %b}", isHeads);
	
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Coin) {
			Coin that = (Coin)obj;
			return this.isHeads == that.isHeads;
		}
		return false;
	}
}
