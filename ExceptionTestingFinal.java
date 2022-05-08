import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTestingFinal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean inputIsGood = false;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		while(!inputIsGood) {
			System.out.println("Enter a number!");
			try {
				num1 = scan.nextInt();
				inputIsGood = true;
			} catch(InputMismatchException ime) {
				System.out.println("Enter numbers only!!");
				scan.nextLine();
			} finally {
				System.out.println("Don't forget that numbers are constants.");
			}
		}
		
		//while(num2 == 0) {
			System.out.println("Enter another number.");
			num2 = scan.nextInt();
		//}
		
		try {
			result = num1/num2;
		} catch(ArithmeticException ae) {
			System.out.println("an error occured!~");
			
			System.out.println(ae.getMessage());
			//ae.printStackTrace();
		}
		System.out.println("Result: " + result);
	}
}