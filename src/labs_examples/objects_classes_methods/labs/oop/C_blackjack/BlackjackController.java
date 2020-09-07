package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        BlackjackController controller = new BlackjackController();
        String name = Player.askName();
        controller.welcome(name);
        controller.playGame(name);
    }

    //Methods Section
    public void playGame(String name) {
        Deck deck;
        //create player1 and the computer
        Player p1 = new Player(name);
        p1.getBet();
        Player p2 = new Player("Computer");

        do {
            deck = new Deck();

            //deal first card to player and computer
            dealFirstCards(deck, p1);
            dealFirstCards(deck, p2);

            //check and see who's winning
            checkScoreOnFirstCards(p1, p2);

            //check if we need to deal another card
            dealAnotherCardToPlayer(deck, p1);
            dealAnotherCardToComputer(deck, p2, p1);
            checkScore(p1, p2);

            //Clear hands
            p1.clearHand();
            p2.clearHand();

            //Keep track of how many games player 1 has played
            p1.setGamesPlayed(p1.getGamesPlayed() + 1);

            //Keep track of number of games played
            System.out.println("You have played " + p1.getGamesPlayed() + " games.");
            System.out.println("You won " + p1.getNumWinsP1() + " games.");
            System.out.println("The computer won " + p2.getNumWinsP2() + " games.");
        } while (playAgain(p1));
    }

    //Welcomes the user to the game
    public void welcome(String name) {
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
        int x = Math.multiplyExact(2,3);
    }

    //Deal first card to player
    public void dealFirstCards(Deck deck, Player player) {
        if(!player.getName().equalsIgnoreCase("Computer")){
            deck.deal(player);
            System.out.println(player.getName() + " Your first card is " + player.getHand());
        } else {
            deck.deal(player);
            System.out.println("Computer has " + player.getHand());
        }
    }

    //Quick check to see who's winning after the first card is dealt to player and computer
    public void checkScoreOnFirstCards(Player p1, Player p2) {
        if (p1.getHand().getHandValue() < p2.getHand().getHandValue()) {
            System.out.println("Well " + p1.getName() + " it looks like the computer is winning so far ...");
        }
    }

    //Deal cards to player, until player says no
    public void dealAnotherCardToPlayer(Deck deck, Player p1) {
        //Deal p1 a card
        deck.deal(p1);

        //show score
        System.out.println(p1.getName() + ", you have " + p1.getHand());

        //Step 2: Ask if they want another card, only if they didn't lose
        if (p1.getHand().getHandValue() < 21) {
            Scanner dealAgain = new Scanner(System.in);
            System.out.println(p1.getName() + " do you want another card? (y/n)");
            String dealCard = dealAgain.next();

            if (dealCard.equalsIgnoreCase("y")) {
                dealAnotherCardToPlayer(deck, p1);
            } else if (dealCard.equalsIgnoreCase("n")) {
                System.out.println(p1.getName() + " you have " + p1.getHand());
            }

            //did they enter a valid response?
            if (!dealCard.equalsIgnoreCase("n") && !dealCard.equalsIgnoreCase("y")) {
                do {
                    System.out.println(p1.getName() + " that's not a valid input, do you want another card (y/n)");
                    Scanner hit = new Scanner(System.in);
                    dealCard = hit.next();
                } while (!dealCard.equalsIgnoreCase("y") && !dealCard.equalsIgnoreCase("n"));

                if (dealCard.equalsIgnoreCase("n")) {
                    System.out.println(p1.getName() + " you have " + p1.getHand());
                }
                else if (dealCard.equalsIgnoreCase("y")) {
                    dealAnotherCardToPlayer(deck, p1);
                }
            }
        }
    }

    //Deal cards to computer
    public void dealAnotherCardToComputer(Deck deck, Player p2, Player p1) {
        //Deal a card to computer
        deck.deal(p2);
        System.out.println("Computer has " + p2.getHand());
    }

    //Logic chain to see who won and to keep score
    public void checkScore(Player p1, Player p2) {
        //if both computer && p1 < 21, but p1 > computer, p1 wins, otherwise p1 loses
        if (p1.getHand().getHandValue() < 21 && p1.getHand().getHandValue() > p2.getHand().getHandValue()) {
            p1.setPot(p1.getPot() + p1.getPlayerBet());
            p1.setNumWinsP1(p1.getNumWinsP1() +1 );
            System.out.println(p1.getName() + " you won $" + p1.getPlayerBet() + " and have $" + (p1.getPot()));
        }

        //if both computer && p1 < 21, however computer > p1, computer wins, p1 loses
        else if (p2.getHand().getHandValue() < 21 && p2.getHand().getHandValue() > p1.getHand().getHandValue()) {
            p1.setPot(p1.getPot() - p1.getPlayerBet());
            p2.setNumWinsP2(p2.getNumWinsP2() +1 );
            System.out.println(p1.getName() + " you lost $" + p1.getPlayerBet() + " and have $" + (p1.getPot()));
        }

        //if p1 > 21, loss for p1 or if computer gets blackjack, loss for p1
        else if (p1.getHand().getHandValue() > 21) {
            p1.setPot(p1.getPot() - p1.getPlayerBet());
            p2.setNumWinsP2(p2.getNumWinsP2() +1 );
            System.out.println(p1.getName() + " you lost $" + p1.getPlayerBet() + " and have $" + (p1.getPot()));
        }

        //if computer > 21, win for p1
        else if (p2.getHand().getHandValue() > 21) {
            p1.setPot(p1.getPot() + p1.getPlayerBet());
            p1.setNumWinsP1(p1.getNumWinsP1() +1 );
            System.out.println(p1.getName() + " You won");
        }

        //if p1 gets blackjack
        else if (p1.getHand().getHandValue() == 21) {
            p1.setPot(p1.getPot() + p1.getPlayerBet());
            p1.setNumWinsP1(p1.getNumWinsP1() +1 );
            System.out.println(p1.getName() + " ******************* ");
            blackJack();
            System.out.println(p1.getName() + " you won $" + p1.getPlayerBet() + " and have $" + (p1.getPot()));
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

    //See if they want to play again
    public boolean playAgain(Player p1) {
        Scanner playAgain = new Scanner(System.in);
        System.out.println(p1.getName() + " do you want to play again? (y/n)");
        String play = playAgain.next();
        boolean round = play.equalsIgnoreCase("y");

        //Check if it was a valid user input
        if (!play.equalsIgnoreCase("n") && !play.equalsIgnoreCase("y")) {
            do {
                System.out.println(p1.getName() + " that's not a valid input, do you want to play again (y/n)");
                Scanner valid = new Scanner(System.in);
                play = valid.next();
            } while (!play.equalsIgnoreCase("y") && !play.equalsIgnoreCase("n"));

        }

        if (play.equalsIgnoreCase("y") && p1.getPot() >= p1.getPot() - p1.getPlayerBet()) {
            //what if they have 0$ but a negative pot?
            if(p1.getPot() - p1.getPlayerBet() < 0){
               System.out.println(p1.getName() + " Looks like you need more money to play again");
                blackJack();
                System.exit(0);
            }
            System.out.println(p1.getName() + " you have a total of $" + p1.getPot() + " remaining in your pot.");
            playGame(p1.getName());
        }

        else if (play.equalsIgnoreCase("n")) {
            System.out.println(p1.getName() + " you have $" + p1.getPot() + " thank you for playing ...");
            blackJack();
            System.exit(0);
        }

        else if (p1.getPot() < 0 || p1.getPot() < p1.getPot() - p1.getPlayerBet()) {
            System.out.println(p1.getName() + " Looks like you need more money to play again");
            System.out.println(p1.getName() + " you have $" + p1.getPot() + " thanks for playing ...");
            blackJack();
            System.exit(0);
        }
        return round;
    }
}


