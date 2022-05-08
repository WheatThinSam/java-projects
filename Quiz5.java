//Ruben Gonzalez
//ITSE-1302-002
//6/22/17
//Quiz4

import java.util.Random;

public class Quiz5
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		System.out.println("Num between 1-10 = " + (rand.nextInt(10)+1));
		System.out.println("Num between 13-71 = " + (rand.nextInt(59)+13));
		System.out.println("The square root of 123456 = " + (Math.sqrt(123456)));
		System.out.println("PI^7 is = " + (Math.pow(Math.PI,7)));
	}
}