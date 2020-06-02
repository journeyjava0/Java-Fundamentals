package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate valyue, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean isFree = false;
        System.out.println(isFree);
        char firstInitial = 'A';
        System.out.println(firstInitial);
        byte today = 15;
        System.out.println(today);
        short year = 2020;
        System.out.println(year);
        int population = 256987;
        System.out.println(population);
        long bigNumber = 848920101849309l;
        System.out.println(bigNumber);
        float cost = 287.34856478f;
        System.out.println(cost);
        double squareRoot = 45.83928948;
        System.out.println(squareRoot);
    }

}