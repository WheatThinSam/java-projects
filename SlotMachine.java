//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/27/17
//PP 5.8

import java.util.Random;

public class SlotMachine {
	
	Random rand = new Random();
	int slot1, slot2, slot3;
	
	public int getSlot1() {
		return slot1;
	}
	public int getSlot2() {
		return slot2;
	}
	public int getSlot3() {
		return slot3;
	}
	
	public void spin() {
		slot1 = rand.nextInt(10);
		slot2 = rand.nextInt(10);
		slot3 = rand.nextInt(10);
	}
	
	public String toString() {
		return String.format("SlotMachine {slot1: %d, slot2: %d, slot3: %d}", 
								slot1,
								slot2,
								slot3);
	}
	
	
	
}