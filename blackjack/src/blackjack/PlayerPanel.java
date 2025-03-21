package blackjack;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 * <b>class PlayerPanel</b> extends to the parent <b>class JPanel</b> and creates a JPanel. 
 * This JPanel is used to create space for the class Card to enter the JFrame of the class
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class PlayerPanel  extends JPanel {
	
	/**
	 * @constructor creates a panel with a FlowLayout that will have background color green		
	 */
	
	PlayerPanel(){
		
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
		
	}
	
}
