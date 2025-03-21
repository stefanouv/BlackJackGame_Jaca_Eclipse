package blackjack;

/**
 * <b>abstract class CardSide</b> is an abstract class which has an abstract method that will be inherited by the child classes
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public abstract class CardSide {
	
	/**
	 * @constructor does nothing	
	 */
	
	CardSide(){}
	
	
	/**
	 * 
	 * @param method <b>abstract void configurePanel<b> accepts a CardPanel object
	 */
	abstract void configurePanel(CardPanel cp);

}
