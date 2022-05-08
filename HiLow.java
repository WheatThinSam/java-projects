import java.util.Random;
import java.util.Scanner;

public class HiLow {
      public static void main(String[] args) {
           Random random = new Random();
           Scanner scanner = new Scanner(System.in);

           int number;
           int guess = 1;
           int count = 0;

           number = random.nextInt(10) + 1;

           while (guess!=number) {
                System.out.print("Enter your guess: ");

                guess = scanner.nextInt();

                count++;

                if (guess<number) {

                     System.out.println("Your guess was too low, please enter another number:");

                } else if (guess>number) {
                     System.out.println("Your guess was too high, please enter another number:");

                  }

               else {
                     System.out.println("Yay the number was " + number + " and it took you " + count +                                                     " tries");
               }
                 }
      }
}