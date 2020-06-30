package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        //scanner and variable declaration
        Scanner nums = new Scanner(System.in);
        int[] input = new int[3];
        int sum = 0;
        int avg = 0;

        //user instructions
        System.out.print("The numbers, there will be 10 in total: ");

        //populate the array with user's input
        for(int i = 0; i < input.length; i++){
        input[i] = nums.nextInt();
        }

        //calculate the sum
        for (int j : input) {
           sum += j;
        }

        //calculate average
        avg = sum/input.length;

        //Print out results
        System.out.println("Total sum is: " + sum + " and the avarge is: " + avg);
    }
}