package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {

    private Card[] cards;
    private ArrayList<Integer> usedCards;
    private String[] suits = {"♠", "♦", "♥", "♣"};

    public Deck() {
        cards = new Card[52];
        usedCards = new ArrayList<>();
        populateDeck();
    }

    public void populateDeck() {
        int index = 0;
        for (int i = 1; i < 14; i++) {
            for (String s : suits) {
                Card c = new Card(i, s);
                cards[index] = c;
                index++;
            }
        }
    }

    public void deal(Player player) {
        Random r = new Random();
        int index = r.nextInt(52);

        while (usedCards.contains(index)) {
            index = r.nextInt(52);
        }

        usedCards.add(index);
        Card c = cards[index];
        player.getHand().getCards().add(c);
    }

//Didn't use this method, but keeping it here just in case
//    public void computerAI(Player p2, Player p1){
//        if (p2.getHand().getHandValue() <= 16 || p2.getHand().getHandValue() < p1.getHand().getHandValue()) {
//            System.out.println("Computer has " + p2.getHand() + " and will hit");
//            deal(p2);
//            System.out.println("Computer has " + p2.getHand());
//        } else if (p2.getHand().getHandValue() > 21) {
//            System.out.println("Computer lost");
//        }
//    }

//Didn't actually use this method, but keeping it here just in case
//    public void dealAnotherCard(Player p1, Player p2) {
//        Scanner anotherCard = new Scanner(System.in);
//        System.out.println(p1.getName() + " do you want another card? (y/n)");
//        String hit = anotherCard.next();
//
//        if (hit.equalsIgnoreCase("n")) {
//            System.out.println(p1.getName() + " Your cards are " + p1.getHand());
//        }
//
//        computerAI(p1, p2);
//
//        if (hit.equalsIgnoreCase("y")) {
//            deal(p1);
//            System.out.println(p1.getName() + " Your cards are " + p1.getHand());
//
//            if (p2.getHand().getHandValue() < 16) {
//                System.out.println("Computer has " + p2.getHand() + " and will hit");
//                deal(p2);
//                System.out.println("Computer has " + p2.getHand());
//                if (p2.getHand().getHandValue() > 21) {
//                    System.out.println("Computer lost");
//                    return;
//                }
//            } else System.out.println("Computer stays " + p2.getHand());
//
//
//            if (p1.getHand().getHandValue() < 21) {
//                dealAnotherCard(p1, p2);
//            }
//
//            if (p1.getHand().getHandValue() == 21 || p2.getHand().getHandValue() == 21) {
//                return;
//            }
//
//            if (p1.getHand().getHandValue() > 21 || p1.getHand().getHandValue() > 21) {
//                return;
//            }
//        }
//
//        if (!hit.equalsIgnoreCase("y") && !hit.equalsIgnoreCase("n")) {
//            System.out.println("not a valid input, try again");
//            dealAnotherCard(p1, p2);
//        }
//    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }
}
