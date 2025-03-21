package blackjack;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * <b>class BlackJackGUI</b> extends to the parent <b>class JFrame</b> creates a frame which is divided into three horizontal strips in which the player's
 * selected cards go in the top, the selected cards of the game's mother appear in the bottom and the deck upside down in the central one and a button called
 * stop. By clicking on the upside-down deck, the player will draw cards first, as soon as the stop button is pressed, the mother takes a turn, 
 * by clicking on the upside-down deck, she draws cards, as soon as the stop button is pressed, a message appears who won.
 * @author <b>Vasilis</b>,<b>Giannis</b>,<b>Thanasis</b>
 * @version <b>1.0.0</b>
 */

public class BlackJackGUI extends JFrame{
	
	PlayerPanel northplayer = new PlayerPanel();
	PlayerPanel southplayer = new PlayerPanel();
	JPanel centerarea = new JPanel();
	JButton stopbutton = new JButton();
	CardPanel centercardpanel = new CardPanel();
	Trapoula trapoula = new Trapoula();
	Card randomcard,northcard,southcard;
	int i = 0;
	int nrtplscore = 0;
	int sthplscore = 0;
	int figurenum;
	
	BlackJackGUI(){
		
		this.setSize(600, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("BlackJackGUI");
		this.getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().setBackground(Color.green);
		this.setVisible(true);
		
		this.add(southplayer,BoxLayout.X_AXIS);
		this.add(centerarea,BoxLayout.X_AXIS);
		this.add(northplayer,BoxLayout.X_AXIS);
		
		southplayer.setBackground(Color.green); 
		northplayer.setBackground(Color.green);
		
		
		stopbutton.setText("Stop");
		centerarea.setLayout(new FlowLayout());
		centerarea.setBackground(Color.green);
		centerarea.add(centercardpanel);
		centerarea.add(stopbutton);
		
		trapoula.shufflingCards();
		randomcard = new Card(trapoula.drawCard().getSymbol(),trapoula.drawCard().getType());
		randomcard.notvisibleside.configurePanel(centercardpanel);
		
		
		stopbutton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				i++;
				if (i == 2) {
					if (((nrtplscore <= 21 &&  sthplscore <= 21) && (nrtplscore <= sthplscore)) || (nrtplscore > 21 && sthplscore <= 21)) {
						JLabel winner = new JLabel("The winner is the mother!!!");
						centerarea.add(winner);
					}
					else if(((nrtplscore <= 21 &&  sthplscore <= 21) && (nrtplscore > sthplscore)) || (nrtplscore <= 21 && sthplscore > 21)) {
						JLabel winner = new JLabel("The winner is the player!!!");
						centerarea.add(winner);
					}
					else {
						JLabel winner = new JLabel("YOU   ARE   L O S E R S  ! ! !");
						centerarea.add(winner);
					}
				}	
				stopbutton.revalidate();
				stopbutton.repaint();
				
			}
		});
		
		centercardpanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				if (i == 0) {	
					
					CardPanel northcardpanel = new CardPanel();
					northplayer.add(northcardpanel);
					northcard = randomcard;
					northcard.visibleside.configurePanel(northcardpanel);
							
					if (randomcard.getType() == 11 || randomcard.getType() == 12 || randomcard.getType() == 13) {
						figurenum = 10;
					}
					else {
						figurenum = randomcard.getType();
					}
							
					nrtplscore = nrtplscore + figurenum;
							
					randomcard = new Card(trapoula.drawCard().getSymbol(),trapoula.drawCard().getType());
					randomcard.notvisibleside.configurePanel(centercardpanel);
						
					northplayer.revalidate();
					northplayer.repaint();
				}
				if (i == 1) {
					
					CardPanel southcardpanel = new CardPanel();
					southplayer.add(southcardpanel);
					southcard = randomcard;
					southcard.visibleside.configurePanel(southcardpanel);
						
					if (randomcard.getType() == 11 || randomcard.getType() == 12 || randomcard.getType() == 13) {
						figurenum = 10;
					}
					else {
						figurenum = randomcard.getType();
					}
						
					sthplscore = sthplscore + figurenum;
					
					randomcard = new Card(trapoula.drawCard().getSymbol(),trapoula.drawCard().getType());
					randomcard.notvisibleside.configurePanel(centercardpanel);
					
					southplayer.revalidate();
					southplayer.repaint();
					}	
			}
			
			});
		
		this.revalidate();
		this.repaint();
		this.pack();
	}
	
	public static void main(String[] args) {
		new BlackJackGUI();
	}

}
