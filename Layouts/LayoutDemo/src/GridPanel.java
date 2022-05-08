import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class GridPanel extends JPanel {
	public GridPanel() {
		GridLayout layout = new GridLayout(2, 3);
		
		setLayout(layout);
		
		setBackground(Color.magenta);
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
	
	}
}
