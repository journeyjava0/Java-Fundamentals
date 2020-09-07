package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int playerBet;
    private static int pot = 0;
    private static int numWins = 0;
    private static int computerWins = 0;
    private static int gamesPlayed = 0;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    //gets the user's bet
    public void getBet() {

        Scanner bet = new Scanner(System.in);

        if (gamesPlayed == 0) {
            System.out.println("Each bet is automatically 10% of your initial pot");
            System.out.println("How much would you like to start with? $");

        //See if they provided a valid input
            validInput(bet);

            pot = bet.nextInt();
            System.out.println("Really? Are you sure you want to bet $" + pot + "? Well, too late now, good luck!");

            if (gamesPlayed > 0) {
                System.out.println("You have $" + getPot() + " left.");
            }
        }
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getPlayerBet() {
        playerBet = (int) Math.ceil(pot * .1);
        return playerBet;
    }

    //Ask the user for their name and save in variable 'name'
    public static String askName() {
        System.out.println("What is your name? ");
        Scanner playerName = new Scanner(System.in);
        String name = playerName.nextLine();
        return name;
    }

    public boolean validInput(Scanner bet){

        int count = 0;

        if(!bet.hasNextInt()) {
            do {
                System.out.println("That's not a valid input " + name + " let's try that again!");
                bet.next();
                if(bet.hasNextInt()){
                    continue;
                }
                count++;
            } while (!bet.hasNextInt());
        }
        if (count > 0) {
            System.out.println("That's better " + name);
        } return bet.hasNextInt();
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

    //Keep track of user wins separately from computer
    public int getNumWinsP1() {
        return numWins;
    }

    //Need to keep track of computer wins separately from user wins
    public int getNumWinsP2(){
        return computerWins;
    }

    //Keep track of user wins separately from computer
    public void setNumWinsP1(int numWins) {
        this.numWins = numWins;
    }

    //Need to keep track of computer wins separately from user wins
    public void setNumWinsP2(int computerWins){
        this.computerWins = computerWins;
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
