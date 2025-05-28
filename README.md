# Blackjack Game

This is a simple Blackjack game written in Java using the Swing framework for the GUI. The user plays against the "mother" (computer), drawing cards and comparing the scores to determine the winner. The game interface is divided into three sections to show the player's cards, the mother's cards, and the deck of shuffled cards.

## Features

- **Player vs. Mother**: The user competes against the computer (the "mother").
- **Deck Management**: Cards are shuffled and drawn from a deck.
- **Card Display**: Cards are displayed with images for a realistic appearance.
- **Game Flow**: The player can stop drawing cards, and the game will calculate the winner based on the total score.

## How to Run

1. Clone this repository to your local machine.
2. Compile and run the program in your Java development environment.
3. The GUI will open, allowing you to play Blackjack with the computer.

## Classes

- **BlackJackGUI**: Handles the main game interface and game flow.
- **Card**: Represents a single playing card with its type and symbol.
- **CardFront**: Displays the front side of the card.
- **CardBack**: Displays the back side of the card.
- **CardPanel**: A panel to hold the card images.
- **PlayerPanel**: Displays the player's hand.
- **Trapoula**: Manages the deck of cards, shuffling, and drawing.
