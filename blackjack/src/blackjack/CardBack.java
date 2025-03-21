package blackjack;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * <b>class CardBack</b> extends to the parent <b>abstract class CardSide</b>, put the picture of the back view of the card 
 * With the inherited method places the image inside <b>class CardPanel</b>.
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */
public class CardBack extends CardSide {
	
	/**
	 * @param <b>backicon</b> it is data type of ImageIcon and we put in the picture of back view of the card
	 * @param <b>backjbl</b> it is data type of JLabel and we put in the variable backicon
	 */
	
	ImageIcon backicon;
	JLabel backjbl;
		
	/**
	 * @constructor variable <b>backicon</b> we produce a new ImageIcon object and put in the picture of the back card view 
	 * 				variable <b>backjbl</b> we produce a new JLabel, then we call the method <b>setIcon</b> and put in the variable <b>backicon</b>
	 */
	
	CardBack(){
		
		backicon = new ImageIcon("BACKSIDE.jpg");
		backjbl = new JLabel();
		backjbl.setIcon(backicon);
				
	}

	@Override
	/**
	 * @param method that adds backjbl to the CardPanel
	 */
	void configurePanel(CardPanel cp) {
		
		cp.add(this.backjbl);
		
	}
}
