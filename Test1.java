import java.util.Scanner;


public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Enter a number greater than zero: ");
		number = scan.nextInt();
		if (number <= 0){
			System.out.println("ERROR");
		}
		while (number > 0){
			System.out.println("The countdown begins");
			number--;
			System.out.println("..." + number);
		}
	}
}
