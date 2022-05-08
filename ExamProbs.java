import java.util.Scanner;
import java.util.Random;

public class ExamProbs {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		String firstName, lastName, username;
		int random, pow;
		pow = 2;
		System.out.println("What's your first name? ");
		firstName = scan.nextLine();

		System.out.println("What's your last name? ");
		lastName = scan.nextLine();

		username = (firstName.substring(0,1)) + (lastName.substring(0,5));

		random = (rand.nextInt(16)+10);
		System.out.println("Your username is: " + username.toLowerCase() + (int)Math.pow(random,pow));
	}
}
