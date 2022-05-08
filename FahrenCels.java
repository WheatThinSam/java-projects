//Ruben Gonzalez
//ITSE-1302-002
//6/19/17
//PP 2.5

import java.util.Scanner;

public class FahrenCels
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What's the temp in Fahrenheit?");
		float Fahren; Fahren = scan.nextFloat();
		System.out.println("the temp in Celsius is: " + ((Fahren - 32)*5/9));
	}
}