import javax.swing.JFrame;
import javax.swing.JPanel;


public class LayoutDemoTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Twitter Analyzise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.add(new IntroPanel());
		
		frame.getContentPane().add(panel1);
		frame.pack();
		frame.setVisible(true);
	}

}
