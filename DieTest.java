public class DieTest {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        System.out.println(die1);
         
        die1.roll();
        System.out.println(die1);
         
        for(int x = 0; x < 25; x++) {
            die1.roll();
            die2.roll();
            System.out.println("\ndie1 is " + die1.getFaceValue());
            System.out.println("die2 is " + die2.getFaceValue());
            System.out.println("sum is  " + (die1.getFaceValue() + die2.getFaceValue()));
        }
    }
}