package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int playerBet;
    private static int pot = 0;
    private int numWins;
    private int gamesPlayed;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    //gets the user's bet
    public void getBet() {
        Scanner bet = new Scanner(System.in);
        int count = 0;
        do {
            if (gamesPlayed == 0) {
                System.out.println("How much would you like bet? $");
            }
            else if (gamesPlayed >=1){
                System.out.println("You have $" + pot + " in you pot for this round.");
            }
            System.out.println("Each bet is automatically 10% of your remaining pot");
            while (!bet.hasNextInt()) {
                System.out.println("That's not a valid input " + name + " let's try that again!");
                bet.next();
                count++;
            }
            pot = bet.nextInt() + pot;
        } while (pot <= 0);

        if (count > 0) {
            System.out.println("That's better " + name);
        }
        System.out.println("Really? Are you sure you want to bet $" + pot + "? Well, too late now, good luck!");
        playerBet = (int) Math.ceil(pot * .1);
    }

    //Returns the total pot ... how to calculate each time they bet how much they have left?
    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getPlayerBet() {
        return playerBet;
    }

    //Ask the user for their name and save in variable 'name'
    public static String askName() {
        System.out.println("What is your name? ");
        Scanner playerName = new Scanner(System.in);
        String name = playerName.nextLine();
        return name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }

    public void clearHand() {
        hand = new Hand();
    }
}
