import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceGraphique extends JPanel {

	private final int xSize = 500;
	private final int ySize = 500;
	private final static Color BGCOLOR = Color.gray;
	
	
	public InterfaceGraphique() {
		setPreferredSize(new Dimension(xSize, ySize));
		setOpaque(true);
		setBackground(BGCOLOR);
	}
	
	

}
