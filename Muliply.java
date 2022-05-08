//Ruben Gonzalez
//Michael Madrigal
//ITSE 1302-002
//7/27/17
//PP 5.

public class Multiply {
	public static void main(String[] args) {

        for(int x = 1; x <= 10000; x *= 3) {
            System.out.println("x is " + x);
        }
         
        for(int x = 1; x <= 12; x++) {
            for(int y = 1; y <= 12; y++) {
                System.out.println(x + " * " + y + " = " + (x*y));
            }
            System.out.println();
        }
    }
}