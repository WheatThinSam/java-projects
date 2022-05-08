//Ruben Gonzalez
//Michael Madrigal
//Cosc 1437-002
//1/27/18
//PP 4.1

public class Counter {
	private int count;
	
	public Counter() {
		count = 0;
	}
	
	public void click() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public void reset() {
		count = 0;
	}
	
	public String toString() {
		return String.format("Counter {count: " + count + "}");
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Counter) {
			return this.count == that.count;
		}
		return false;
	}
	}
	
	