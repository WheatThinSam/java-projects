//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.9

public class RollingDice2 {
	public static void main(String[] args) {
		
		PairOfDice myDice = new PairOfDice();
		
		myDice.setDie1(4);
		myDice.setDie2(5);
		
		System.out.println("Die one amount: " + myDice.getDie1());
		System.out.println("Die two amount: " + myDice.getDie2());
		
		myDice.roleDice();
		
		System.out.println("Die one amount: " + myDice.getDie1());
		System.out.println("Die two amount: " + myDice.getDie2());
		
		System.out.println("Dice sum amount: " + myDice.getSum());
		
		System.out.println(myDice.toString());
	}
}
