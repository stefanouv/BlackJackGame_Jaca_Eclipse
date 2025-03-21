package blackjack;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

/**
 * <b>class CardPanel</b> extends to the parent <b>class JPanel</b> and creates a JPanel. 
 * This JPanel is used to create space for the class Card to enter the JFrame of the class
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class CardPanel extends JPanel {
	
	/**
	 * @constructor creates a panel with a BorderLayout that will have background color white		
	 */
	
	CardPanel(){

		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);
			
	}
}