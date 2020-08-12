package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private String suit;
    private int cardValue;

    public Card() {
    }

    public Card(int cardValue, String suit) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String card = "";
        if (cardValue == 1) {
            card = card + "Ace";
        } else if (cardValue > 1 && cardValue < 11) {
            card = card + cardValue;
        } else if (cardValue == 11) {
            card = card + "Jack";
        } else if (cardValue == 12) {
            card = card + "Queen";
        } else if (cardValue == 13) {
            card = card + "King";
        }
        card = card + suit;
        return card;
    }
}