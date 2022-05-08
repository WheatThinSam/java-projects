//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.9

public class PairOfDice {
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	public void setDie1(int val) {
		die1.setFaceValue(val);
	}
	public void setDie2(int val) {
		die2.setFaceValue(val);
	}
	
	public int getDie1() {
		return die1.getFaceValue();
	}
	public int getDie2() {
		return die2.getFaceValue();
	}
	
	public void roleDice() {
		die1.roll();
		die2.roll();
	}
	
	public int getSum() {
		return (die1.getFaceValue() + die2.getFaceValue());
	}
	
	public String toString() {
		return String.format("PairOfDice {die1: %d, die2: %d, sum: %d}",
							die1.getFaceValue(),
							die2.getFaceValue(),
							getSum());
	}
}
