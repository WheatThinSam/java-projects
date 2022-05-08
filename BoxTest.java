//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302 002
//7/21/2017
//PP 4.5

public class BoxTest {
	public static void main(String[] args) {
		
		Box box1 = new Box(3, 5, 6, true);
		Box box2 = new Box(2, 4, 7, false);
		Box box3 = new Box(1, 8, 9, true);
		
		box1.setHight(4);
		box2.setWidth(8);
		box3.setDepth(9);
		box2.setFull(true);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
	}
}