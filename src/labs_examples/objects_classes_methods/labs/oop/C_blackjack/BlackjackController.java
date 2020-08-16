package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

//Question: Can we go through the warnings in this class?
public class BlackjackController {
    private static String name;
    private static int pot;
    private static int playerBet;
    private static boolean round;
    private static String validInput = " ";
    private static String validResponse = " ";
    private static String dealCard;

    public static void main(String[] args) {
        Deck deck = new Deck();
        askName();
        welcome();
        getBet();
        playGame(deck);
    }

    //Methods Section
    public static void playGame(Deck deck) {
        do {
            //create player1 and the computer
            Player p1 = new Player(name);
            Player p2 = new Player("Computer");

            //deal first card to player and computer
            dealFirstCardToPlayer(deck, p1);
            dealFirstCardToComputer(deck, p2);

            //check and see who's winning
            checkScoreOnFirstCards(p1, p2);

            //check if we need to deal another card
            dealAnotherCardToPlayer(deck, p1);
            dealAnotherCardToComputer(deck, p2, p1);
            checkScore(p1, p2);

            //See if they want to play again
            playAgain();

        } while (round && pot >= pot - playerBet);
    }

    //Ask the user for their name and save in variable 'name'
    public static String askName() {
        System.out.println("What is your name? ");
        Scanner playerName = new Scanner(System.in);
        name = playerName.nextLine();
        return name;
    }

    //Returns user's name whenever called ... not required since I gave global scope to 'name'
    public static String getName() {
        return name;
    }

    //Welcomes the user to the game
    public static void welcome() {
        System.out.println("Welcome to ... ");
        blackJack();
        StringBuilder greeting = new StringBuilder();
        greeting.append("Good luck " + name + " you'll be playing against the computer");
        greeting.append(" In this version of BlackJack, Aces are only worth 1 ... keep that in mind :)");
        System.out.println(greeting);
    }

    //creates the ASCII blackJack art
    public static void blackJack() {
        StringBuilder blackJack = new StringBuilder();
        blackJack.append(" _     _            _    _            _    \n");
        blackJack.append("| |   | |          | |  (_)          | |   \n");
        blackJack.append("| |__ | | __ _  ___| | ___  __ _  ___| | __\n");
        blackJack.append("| '_  | |/ _` |/ __| |/ / |/ _` |/ __| |/ /\n");
        blackJack.append("| |_) | | (_| | (__|   <| | (_| | (__|   <| \n");
        blackJack.append("|_.__/|_|__,__| ___|_|_ |__,_|__|_|__|__|_|\n");
        blackJack.append("                       _/ |                \n");
        blackJack.append("                      |__/      ");
        System.out.println(blackJack);
    }

    //gets the user's bet
    public static int getBet() {
        Scanner bet = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("How much would you like to start with? $");
            System.out.println("Each bet is automatically 10% of your remaining pot");
            while (!bet.hasNextInt()) {
                System.out.println("That's not a valid input " + name + " let's try that again!");
                bet.next();
                count++;
            }
            pot = bet.nextInt();
        } while (pot <= 0);

        if (count > 0) {
            System.out.println("That's better " + name);
        }
        System.out.println("Really? Are you sure you want to bet $" + pot + "? Well, too late now, good luck!");
        playerBet = (int) Math.ceil(pot * .1);
        return pot;
    }

    //Returns the total pot ... how to calculate each time they bet how much they have left?
    public static int getPot() {
        return pot;
    }

    //Deal first card to player
    public static void dealFirstCardToPlayer(Deck deck, Player p1) {
        deck.deal(p1);
        System.out.println(name + " Your first card is " + p1.getHand());
    }

    //Deal first card to computer
    public static void dealFirstCardToComputer(Deck deck, Player p2) {
        deck.deal(p2);
        System.out.println("Computer has " + p2.getHand());
    }

    //Quick check to see who's winning after the first card is dealt to player and computer
    public static void checkScoreOnFirstCards(Player p1, Player p2) {
        if (p1.getHand().getHandValue() < p2.getHand().getHandValue()) {
            System.out.println("Well " + name + " it looks like the computer is winning so far ...");
        }
    }

    //Deal cards to player, until player says no
    public static void dealAnotherCardToPlayer(Deck deck, Player p1) {
        //Deal p1 a card
        deck.deal(p1);

        //show score
        System.out.println(name + ", you have " + p1.getHand());

        //Step 2: Ask if they want another card, only if they didn't lose
        if (p1.getHand().getHandValue() < 21) {
            Scanner dealAgain = new Scanner(System.in);
            System.out.println(name + " do you want another card? (y/n)");
            dealCard = dealAgain.next();

            if (dealCard.equalsIgnoreCase("y")) {
                dealAnotherCardToPlayer(deck, p1);
            } else if (dealCard.equalsIgnoreCase("n")) {
                System.out.println(name + " you have " + p1.getHand());
            }

            //did they enter a valid response?
            if (!dealCard.equalsIgnoreCase("n") && !dealCard.equalsIgnoreCase("y")) {
                do {
                    System.out.println(name + " that's not a valid input, do you want another card (y/n)");
                    Scanner hit = new Scanner(System.in);
                    validResponse = hit.next();
                } while (!validResponse.equalsIgnoreCase("y") && !validResponse.equalsIgnoreCase("n"));

                if (validResponse.equalsIgnoreCase("n") || dealCard.equalsIgnoreCase("n")) {
                    System.out.println(name + " you have " + p1.getHand());
                }
                if (validResponse.equalsIgnoreCase("y") || dealCard.equalsIgnoreCase("y")) {
                    dealAnotherCardToPlayer(deck, p1);
                }
            }
        }
    }

    //Deal cards to computer
    public static void dealAnotherCardToComputer(Deck deck, Player p2, Player p1) {
        //Deal a card to computer
        deck.deal(p2);
        System.out.println("Computer has " + p2.getHand());
    }

    public static void checkScore(Player p1, Player p2) {
        //if both computer && p1 < 21, but p1 > computer, p1 wins, otherwise p1 loses
        if (p1.getHand().getHandValue() < 21 && p1.getHand().getHandValue() > p2.getHand().getHandValue()) {
            System.out.println(name + " you won $" + playerBet + " and have $" + (pot + (playerBet)));
            pot = pot + playerBet;
        }

        //if both computer && p1 < 21, however computer > p1, computer wins, p1 loses
        if (p2.getHand().getHandValue() < 21 && p2.getHand().getHandValue() > p1.getHand().getHandValue()) {
            System.out.println(name + " you lost $" + playerBet + " and have $" + (pot - (playerBet)));
            pot = pot - playerBet;
        }

        //if p1 > 21, loss for p1 or if computer gets blackjack, loss for p1
        else if (p1.getHand().getHandValue() > 21) {
            System.out.println(name + " you lost $" + playerBet + " and have $" + (pot - (playerBet)));
            pot = pot - playerBet;
        }

        //if computer > 21, win for p1
        else if (p2.getHand().getHandValue() > 21) {
            System.out.println(name + " You won");
            pot = pot + playerBet;
        }

        //if p1 gets blackjack
        else if (p1.getHand().getHandValue() == 21) {
            System.out.println(name + " ******************* ");
            blackJack();
            System.out.println(name + " you won $" + playerBet + " and have $" + (pot + (playerBet)));
            pot = pot + playerBet;
        }

        //if p1 & computer bust, then it's a tie
        else if (p1.getHand().getHandValue() > 21 && p2.getHand().getHandValue() > 21) {
            System.out.println("It's a tie!");
        }

        //if p1 and computer have same score, then it's a tie
        else if (p1.getHand().getHandValue() == p2.getHand().getHandValue()) {
            System.out.println("It's a tie!");
        }
    }

    public static void playAgain() {
        Scanner playAgain = new Scanner(System.in);
        System.out.println(name + " do you want to play again? (y/n)");
        String play = playAgain.next();
        round = play.equalsIgnoreCase("y");

        //assume the user indicates 'y' or 'n', if 'y' check if they have enough money left
        if (round && pot >= pot - playerBet) {
            System.out.println(name + " you have $" + pot + " remaining ...");
        } else if (play.equalsIgnoreCase("n")) {
            System.out.println(name + " you have $" + pot + " thank you for playing ...");
            blackJack();
            System.exit(0);
        } else if (round && pot == 0 || pot < pot - playerBet) {
            System.out.println(name + " Looks like you need more money to play again");
            System.out.println(name + " you have $" + pot + " thanks for playing ...");
            blackJack();
            System.exit(0);
        }
        //Check if it was a valid user input?
        if (!play.equalsIgnoreCase("n") && !play.equalsIgnoreCase("y")) {
            do {
                System.out.println(name + " that's not a valid input, do you want to play again (y/n)");
                Scanner valid = new Scanner(System.in);
                validInput = valid.next();
            } while (!validInput.equalsIgnoreCase("y") && !validInput.equalsIgnoreCase("n"));
        } else if (validInput.equalsIgnoreCase("y") && pot >= pot - playerBet) {
            System.out.println(name + " you have $" + pot + " remaining ...");
        } else if (validInput.equalsIgnoreCase("n")) {
            System.out.println(name + " you have $" + pot + " thank you for playing ...");
            blackJack();
            System.exit(0);
        } else if (pot == 0 || pot < pot - playerBet) {
            System.out.println(name + " Looks like you need more money to play again");
            System.out.println(name + " you have $" + pot + " thanks for playing ...");
            blackJack();
            System.exit(0);
        }
    }
}


