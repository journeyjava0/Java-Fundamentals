package labs_examples.arrays.labs;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //convert int[] array to an array list
        List<Integer> vals = new ArrayList<>();

        //populate the array list with the values of int[] array
        for (int i : array) {
            vals.add(i);
        }

        // scanner declaration
        System.out.println("Please enter a number from 1 - 10: ");
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();

        //did the user enter valid input?
        if (nums >= 0 && nums <=10) {
            //if yes then determine and return the element of the index
            for (int b : array) {
                if (nums == b) {
                    System.out.println("Found at element: " + vals.indexOf(nums));
                }
            }
        } else System.out.println("That was not a valid input. Please try again.");
    }
}