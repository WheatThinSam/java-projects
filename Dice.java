

public class Dice {
	private int faceValue;
	public static int diceobjects;
	
	public static int getDiceObjectCount() {
		return diceObjects;
	}
	
	public Dice() {
		faceValue = generateRandomInt();
	}
	
	public Dice(int num) {
		if(num <= 6 && num >= 1) {
			this.faceValue = num;
		}
		diceObjects++;
	}
	
	public void setFaceValue(int faceValue) {
		if(num <= 6 && num >= 1) {
			this.faceValue = faceValue;
		}
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public void roll() {
		faceValue = (int)((Math.random() * 6) + 1);
	}
	
	public int generateRandomInt() {
		return (int)((Math.random()*6) + 1);
		
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Dice) {
			Dice that = (Dice)obj;
			if(this.faceValue == that.faceValue) {
				return true;
			}
		}
		return false;
	}
	
	
}