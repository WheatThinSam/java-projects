//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.6

public class Box {
	private int hight, width, depth;
	boolean full;
	
	public Box(int hight, int width, int depth, boolean full) {
		this.hight = hight;
		this.width = width;
		this.depth = depth;
		this.full = full;
	}
	
	public Box() {
		hight = 0;
		width = 0;
		depth = 0;
		full = false;
	}
	
	public int getHight() {
		return hight;
	}
	public int getWidth() {
		return width;
	}
	public int getDepth() {
		return depth;
	}
	public boolean getFull() {
		return full;
	}
	
	public void setHight(int val) {
		hight = val;
	}
	public void setWidth(int val) {
		width = val;
	}
	public void setDepth(int val) {
		depth = val;
	}
	public void setFull(boolean val) {
		full = val;
	}
	
	public String toString() {
		return String.format("Box {hight: %d, width: %d, depth: %d, full: %b}",
							hight,
							width,
							depth,
							full);
	}
}