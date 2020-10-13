package labs_examples.enumerations.labs.Task1;

//1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.

public class EnumController {

    public static void main(String[] args) {
        Books myChoice = Books.HISTORY;
        if(myChoice == Books.FICTION){
            System.out.println("You chose fiction");
        } else System.out.println("You chose something else: " + myChoice.toString());
    }
}
