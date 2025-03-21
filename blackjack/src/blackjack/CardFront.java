package blackjack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <b>class CardFront</b> extends to the parent <b>abstract class CardSide</b>, creates and places the numbers and figures in the right places 
 * for the front of the card to appear correctly.
 * With the inherited method it places the generated image inside the <b>CardPanel class</b>.
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class CardFront extends CardSide {
	
	/**
	 * @param JLapel northcardnumber,southcardnumber generate the card numbers, cardicon creates the card figures
	 * @param type,symbol are the arguments accepted by constructor
	 * @param JPanel positionRightDown,positionLeftUp place the numbers correctly in the corners of the card
	 */
	JLabel northcardnumber,southcardnumber,cardicon;
	int type;
	String symbol;
	JPanel positionRightDown = new JPanel();
	JPanel positionLeftUp = new JPanel();
	
	/**
	 * @constructor takes as arguments the variables type and symbol creates the correct symbols for the numbers 1,11,12,13 
	 * and correctly places the numbers and symbols on the card
	 */
	CardFront(String symbol, int type){
		
		this.type = type;
		this.symbol = symbol;
		
		if (type == 1) {
			northcardnumber = new JLabel("A" + "");
		}
		else if(type == 11) {
			northcardnumber = new JLabel("J" + "");
		}
		else if(type == 12) {
			northcardnumber = new JLabel("Q" + "");
		}
		else if(type == 13) {
			northcardnumber = new JLabel("K" + "");
		}
		else {
			northcardnumber = new JLabel(this.type + "");
		}
			
		if (type == 1) {
			southcardnumber = new JLabel("A" + "");
		}
		else if(type == 11) {
			southcardnumber = new JLabel("J" + "");
		}
		else if(type == 12) {
			southcardnumber = new JLabel("Q" + "");
		}
		else if(type == 13) {
			southcardnumber = new JLabel("K" + "");
		}
		else {
			southcardnumber = new JLabel(this.type + "");
		}
		
		cardicon = new JLabel();
		cardicon.setIcon(new ImageIcon(symbol + ".jpg"));
		
		positionLeftUp.setLayout(new FlowLayout(FlowLayout.LEFT));
		positionLeftUp.add(this.northcardnumber);
		positionLeftUp.setBackground(Color.WHITE);
		
		positionRightDown.setLayout(new FlowLayout(FlowLayout.RIGHT));
		positionRightDown.add(this.southcardnumber);
		positionRightDown.setBackground(Color.WHITE);
		
	}
	
	/**
	 * @param method that adds positionLeftUp, positionRightDown, cardicon  to the CardPanel
	 */
	void configurePanel(CardPanel cp) {
		
		cp.add(this.positionLeftUp,BorderLayout.PAGE_START);
		cp.add(this.positionRightDown,BorderLayout.PAGE_END);
		cp.add(this.cardicon,BorderLayout.CENTER);
		
	}
	
}
