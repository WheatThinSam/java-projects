import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class FlowPanel extends JPanel {

	public FlowPanel() {
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		//TODO - modify layout to see changes in panel
		
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
		
		setBackground(Color.CYAN);
		
	}
}
