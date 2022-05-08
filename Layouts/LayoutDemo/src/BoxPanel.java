import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class BoxPanel extends JPanel {
	public BoxPanel() {
		BoxLayout layout = new BoxLayout(this, BoxLayout.X_AXIS);
		
		setLayout(layout);
		
		setBackground(Color.ORANGE);
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		
		b1.setPreferredSize(new Dimension(100, 100));
		
		add(b1);
		add(Box.createRigidArea(new Dimension(10, 10)));
		add(b2);
		add(Box.createHorizontalGlue());
		add(b3);
		add(b4);
		add(Box.createRigidArea(new Dimension(20, 20)));
		add(b5);
	}
}
