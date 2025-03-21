package blackjack;

/**
 * <b>class Card</b> creates fixed and immutable values and figures that exist above a card as well as their numerical potential.
 * It has two methods for returning the symbol and the number that the class has inside it
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class Card {
	 /**
	  * @param static final int (ACE,TWO,TREE,FOUR,FIVE,SIX,SEVVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING) creates fixed and immutable values that exist above
	  * a card as well as their numerical potential
	  * @param static final String (HEART,SPADE,DIAMOND,CLUB) creates fixed and immutable figures that exist above a card
	  */
	static final int ACE = 1;
	static final int TWO = 2;
	static final int TREE = 3;
	static final int FOUR = 4;
	static final int FIVE = 5;
	static final int SIX = 6;
	static final int SEVVEN = 7;
	static final int EIGHT = 8;
	static final int NINE = 9;
	static final int TEN = 10;
	static final int JACK = 11;
	static final int QUEEN = 12;
	static final int KING = 13;
	
	static final String HEART = "HEART";
	static final String SPADE = "SPADE";
	static final String DIAMOND = "DIAMOND";
	static final String CLUB = "CLUB";
	
	CardFront frontcard;
	CardBack backcard;
	CardSide visibleside;
	CardSide notvisibleside;
	String symbol;
	int type;
	
	Card(String symbol, int type){
		
		this.type = type;
		this.symbol = symbol;
		
		frontcard = new CardFront(symbol,type);
		backcard = new CardBack();
		
		visibleside = frontcard;
		notvisibleside = backcard;
	}

	String getSymbol() {
		
		return this.symbol;
	}
	
	int getType() {
		
		return this.type;
	}
	
}