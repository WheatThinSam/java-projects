//Ruben Gonzalez
//Michael Madrigal
//Cosc 1347
//1/24/18
//Quiz2



public class CoinFlipper {
	public static void main(String[] args) {
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		
		coin1.flip();
		coin2.flip();
		
		System.out.println("Coin 1: " + coin1.getIsHeads());
		System.out.println("Coin 2:" + coin2.getIsHeads());
		
		coin1.setIsHeads(false);
		coin2.setIsHeads(true);
		
		System.out.println("\nAre coins the same?: " + coin1.equals(coin2));
		
		coin1.setIsHeads(true);
		coin2.setIsHeads(true);
		
		System.out.println("How about now?: " + coin2.equals(coin1));
		
		System.out.println(coin1);
		System.out.println(coin2);
		
	}
}