import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class BorderPanel extends JPanel {
	public BorderPanel() {
		BorderLayout layout = new BorderLayout();
		
		setLayout(layout);
		
		setBackground(Color.BLUE);
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3 = new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		JButton b5 = new JButton("Button 5");
		JButton b6 = new JButton("Button 6");
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		southPanel.add(b5);
		southPanel.add(b6);
		
		add(b1, BorderLayout.CENTER);
		add(b2, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		add(b4, BorderLayout.EAST);
		add(b3, BorderLayout.WEST);
	}
}
