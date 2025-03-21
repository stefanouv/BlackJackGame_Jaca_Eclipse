package blackjack;

import java.util.Stack;
import java.util.Vector;

/**
 * <b>class Trapoula</b> through two lists that contain the numbers and figures that exist on a card and with a vector it creates the cards of a deck of cards.
 *  Through two methods, the first shuffles and randomly places the cards in a stack and the second takes the last placed card of the stack
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class Trapoula {
	
	Vector<Card> trapouloxarta = new Vector<Card>();
	Stack<Card> shuffling = new Stack<Card>();
	
	Card card;
	
	int[] numbers = {Card.ACE, Card.TWO, Card.TREE, Card.FOUR, Card.FIVE, Card.SIX, Card.SEVVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING};
	String[] figures = {Card.HEART, Card.SPADE, Card.DIAMOND, Card.CLUB};

	Trapoula(){
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++){
				this.card = new Card(figures[i],numbers[j]);
				this.trapouloxarta.addElement(card );
			}
		}
	}
	
	void shufflingCards(){
		
		for (int i=0; i<52; i++) {
			int randomCard = (int) (Math.random() * trapouloxarta.size());
			shuffling.push(trapouloxarta.remove(randomCard));
		}
	}
	
	Card drawCard() {
		
		return shuffling.pop();
	}
}