import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class IntroPanel extends JPanel {
	
	public IntroPanel(){
		setBackground(Color.lightGray);
		
		add(new JLabel("Enter Company Name: \n"));
		add(new JLabel("Enter Key Words: "));
	}
}
