//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/28/17
//PP 6.3

public class Multiply {
	public static void main(String[] args) {
		
		System.out.println("|============|");
        for(int x = 1; x <= 12; x++) {
            for(int y = 1; y <= 12; y++) {
                System.out.println(x + " * " + y + " = " + (x*y));
            }
            System.out.println("|============|");
        }
    }
}