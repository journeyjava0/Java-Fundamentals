package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards;
    String[] suits = {"♠", "♦", "♥", "♣"};
    ArrayList<String> cardList = new ArrayList<>();

//    1) In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
//    should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
//            (spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings

    public void createDeck () {

        for (String s : suits) {
            cardList.add("Ace " + s);
        }

        for (int i = 2; i < 11; i++) {
            for (String s : suits) {
                cardList.add(i + " " + s);
            }
        }

        for (String s : suits) {
            cardList.add("Jack " + s);
        }

        for (String s : suits) {
            cardList.add("Queen " + s);
        }

        for (String s : suits) {
            cardList.add("King " + s);
        }

        System.out.println(cardList.toString());

        cardList.toArray();
        //Question: I have an array list of my deck, but how to put into the cards array?
        for (int i = 0; i < cardList.size(); i++){
            cards[i] = cardList[i];

        }
    }

    public Deck() {

    }


    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
