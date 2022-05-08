//Ruben Gonzalez
//ITSE-1302-002
//6/20/17
//PP 2.9

import java.util.Scanner;

public class InverseSeconds
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		final int HRS;
		int min;
		int sec;
		
		System.out.println("type amount of time in seconds.");
		System.out.print("Seconds:\n");
		sec = scan.nextInt();
		
		System.out.println("Amount of \"Hours:Minutes:Seconds\" : ");
		
		 min = sec / 60;
		 sec = sec % 60;
		 HRS = min /60;
		 min = min % 60;
		 
		System.out.print(HRS + ":" + min + ":" + sec);
	}
}