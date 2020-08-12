package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        Deck deck = new Deck();
        StringBuilder blackJack = new StringBuilder();
        blackJack.append(" _     _            _    _            _    \n");
        blackJack.append("| |   | |          | |  (_)          | |   \n");
        blackJack.append("| |__ | | __ _  ___| | ___  __ _  ___| | __\n");
        blackJack.append("| '_  | |/ _` |/ __| |/ / |/ _` |/ __| |/ /\n");
        blackJack.append("| |_) | | (_| | (__|   <| | (_| | (__|   <| \n");
        blackJack.append("|_.__/|_|__,__| ___|_|_ |__,_|__|_|__|__|_|\n");
        blackJack.append("                       _/ |                \n");
        blackJack.append("                      |__/      ");

        System.out.println("Welcome to ... ");
        System.out.println(blackJack);
        Scanner playerName = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = playerName.nextLine();
        System.out.println("Good luck " + name + " you'll be playing against the computer");
        System.out.println("In this version of BlackJack, Aces are only worth 1 ... keep that in mind :)");

        Scanner bet = new Scanner(System.in);
        int nameBet;
        int count = 0;
        do {
            System.out.println("How much would you like to start with? $");
            System.out.println("Each bet is automatically 10% of your remaining pot");
            while (!bet.hasNextInt()) {
                System.out.println("That's not a valid input " + name + " let's try that again!");
                bet.next();
                count++;
            }
            nameBet = bet.nextInt();
        } while (nameBet <= 0);

        if (count > 0) {
            System.out.println("That's better " + name);
        }
        int playerBet = (int) Math.ceil(nameBet * .1);
        System.out.println("Really? Are you sure you want to bet $" + nameBet + "? Well, too late now, good luck!");

        //New hand starts here

        boolean round;
        String validInput = " ";

        do {
            Player p1 = new Player(name);
            Player p2 = new Player("Computer");

            String won = name + " you won $" + playerBet + " and have $" + (nameBet + (playerBet));

            deck.deal(p1);
            System.out.println(name + " Your first card is " + p1.getHand());

            deck.deal(p2);
            System.out.println("Computer has " + p2.getHand());

            if (p1.getHand().getHandValue() < p2.getHand().getHandValue()) {
                System.out.println("Well " + name + " it looks like the computer is winning so far ...");
            }

            deck.dealAnotherCard(p1, p2);

            if (p1.getHand().getHandValue() < 21 && p2.getHand().getHandValue() < 21 && p1.getHand().getHandValue() > p2.getHand().getHandValue()) {
                System.out.println(won);
                nameBet = nameBet + playerBet;
            }

            if (p2.getHand().getHandValue() > 21) {
                System.out.println(won);
                nameBet = nameBet + playerBet;
            }

            if (p2.getHand().getHandValue() < 21 && p2.getHand().getHandValue() > p1.getHand().getHandValue()) {
                System.out.println(name + " you lost $" + playerBet + " and have $" + (nameBet - (playerBet)));
                nameBet = nameBet - playerBet;
            }

            if (p1.getHand().getHandValue() == 21) {
                System.out.println(name + " ******************* ");
                System.out.println(blackJack);
                System.out.println(won);
                nameBet = nameBet + playerBet;
            }

            if (p1.getHand().getHandValue() == p2.getHand().getHandValue()) {
                System.out.println("It's a tie!");
            }

            if(p1.getHand().getHandValue() > 21 && p2.getHand().getHandValue() > 21){
                System.out.println("It's a tie!");
            }

            if (p1.getHand().getHandValue() > 21 || p2.getHand().getHandValue() == 21) {
                System.out.println(name + " you lost $" + playerBet + " and have $" + (nameBet - (playerBet)));
                nameBet = nameBet - playerBet;
            }

            Scanner playAgain = new Scanner(System.in);
            System.out.println(name + " do you want to play again? (y/n)");
            String play = playAgain.next();
            round = play.equalsIgnoreCase("y");

            if (round && (nameBet == 0 || nameBet < nameBet - playerBet)) {
                System.out.println(name + " Looks like you need more money to play again");
                System.out.println(name + " you have $" + nameBet + " thanks for playing ...");
                System.out.println(blackJack);
                return;
            }

            if (play.equalsIgnoreCase("n")) {
                System.out.println(name + " you have $" + nameBet + " thanks for playing ...");
                System.out.println(blackJack);
                return;
            }

            if (!play.equalsIgnoreCase("n") && !play.equalsIgnoreCase("y")) {
                do {
                    System.out.println(name + " that's not a valid input, do you want to play again (y/n)");
                    Scanner valid = new Scanner(System.in);
                    validInput = valid.next();
                } while (!validInput.equalsIgnoreCase("y") && !validInput.equalsIgnoreCase("n"));
            }

        } while (round && nameBet >= nameBet - playerBet || validInput.equalsIgnoreCase("y"));

        if (validInput.equalsIgnoreCase("n")) {
            System.out.println(name + " you have $" + nameBet + " thanks for playing ...");
            System.out.println(blackJack);
            return;
        }
    }
}


