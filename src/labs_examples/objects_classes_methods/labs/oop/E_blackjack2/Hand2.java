package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;

    public Hand() {

    }

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        int totalScore = 0;
        for(Card c : cards){
            if(c.getCardValue() > 10){
                totalScore+= 10;
            } else
                totalScore += c.getCardValue();
        }
        return totalScore;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() { //print out the player's hand
        StringBuilder sb = new StringBuilder();
        sb.append(cards.toString());
        // ...
        return sb.toString();
    }
}
