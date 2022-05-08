//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/27/17
//PP 5.8

import java.util.Scanner;

public class Slots {
	public static void main(String[] args) {
		
		int spin = -1;
		boolean machineOn = true;
		SlotMachine sMchn1 = new SlotMachine();
		Scanner scan = new Scanner(System.in);
		
		while (machineOn == true) {
			
			System.out.println("Enter 0 to spin or 1 to endProgram: ");
			spin = scan.nextInt();
			
			if (spin == 0) {
				sMchn1.spin();
			} else if (spin == 1) {
				machineOn = false;
			}
			if (machineOn == true) {
				System.out.println("|===||===||===|");
				System.out.println("  " + sMchn1.getSlot1() + "    " + sMchn1.getSlot2() + "    " + sMchn1.getSlot3());
				System.out.println("|===||===||===|");
				if ((sMchn1.getSlot1() != sMchn1.getSlot2()) || (sMchn1.getSlot1() != sMchn1.getSlot3()) || (sMchn1.getSlot2() != sMchn1.getSlot3())) {
					if (sMchn1.getSlot1() == sMchn1.getSlot2()) {
					System.out.println("slot1 and slot2 match!!" + "|" + sMchn1.getSlot1() + "|" + sMchn1.getSlot2() + "|");
					}
					if (sMchn1.getSlot2() == sMchn1.getSlot3()) {
					System.out.println("slot2 and slot3 match!!" + "|" + sMchn1.getSlot2() + "|" + sMchn1.getSlot3() + "|");
					}
					if (sMchn1.getSlot1() == sMchn1.getSlot3()) {
					System.out.println("slot1 and slot3 match!!" + "|" + sMchn1.getSlot1() + "|" + sMchn1.getSlot3() + "|");
					}
				} else {
					System.out.println("CONGRADULATIONS!!!!! YOU GOT ALL THREE THE SAME!!" + 
					"|" + sMchn1.getSlot1() + "|" + sMchn1.getSlot2() + "|" + sMchn1.getSlot3() + "|");
				}
			}
		}
		System.out.println("End of Program.");
		
	}
}