
public class GameSort {
	public static void main(String[] args) {
		
		HaloGame xBox1 = HaloGame.COMBAT_EVOLVED;
		HaloGame xBox2 = HaloGame.HALO_3_ODST;
		
		System.out.println(xBox1.ordinal());
		System.out.println(xBox2.ordinal());
		
		System.out.println(xBox1.name());
		System.out.println(xBox2.name());
		
		HaloGame[] HaloGames = HaloGame.values();
		
		System.out.println(HaloGames.length);
	}
}