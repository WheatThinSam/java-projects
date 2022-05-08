import java.io. IOException;
import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		int month;
		String monthS;
		Scanner scan = new Scanner(System.in);
		String Month[] = new String[12];
		String Info[] = new String[5];
		Month[0] = "January"; 
		Month[1] = "February";
		Month[2] = "March";
		Month[3] = "April";
		Month[4] = "May";
		Month[5] = "June";
		Month[6] = "July";
		Month[7] = "August";
		Month[8] = "September";
		Month[9] = "October";
		Month[10] = "November";
		Month[11] = "December";
		
		System.out.println("Please enter your name and something you say.\nName:" );
		Info[0] = scan.nextLine();
		System.out.println("Saying:");
		Info[1] =scan.nextLine();
		System.out.println("***********************************************");
		
		System.out.println("\tHello " + Info[0] +"!");
		
		
		System.out.println("\tApparently, you say \"" + Info[1] + "\" alot.");
		System.out.println("***********************************************");
		
		do {
			System.out.println("\tSo... what's your favorite month??\nMonth (1-12):");
			try {
				Info[3] = scan.nextLine();
			} catch (Exception e) {
				System.out.println("please enter y or n.");
			}
			monthS = Info[2];
			month = Integer.parseInt(monthS);
			month--;
			System.out.println("So you like " + Month[month] + "?\n (y/n):");
			try {
				Info[3] = scan.nextLine();
			} catch (Exception e) {
				System.out.println("please enter y or n.");
			}
		
		} while (Info[3].equalsIgnoreCase("n"));
			
		//for (int i = 0; i < (info.length); i++) {
		//	System.out.println(info[i]);
		//}
		
		
	}
}