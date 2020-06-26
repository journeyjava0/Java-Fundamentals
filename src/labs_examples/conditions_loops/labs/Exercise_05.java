package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner lowerBound = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        // assign input to variable as int
        int lower = lowerBound.nextInt();

        Scanner upperBound = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        // assign input to variable as int
        int upper = upperBound.nextInt();
        int sum = 0;

        for (int i = lower; i <= upper; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

        // calculate the average
        double howMany = (upper +1 ) - lower;
        double average = sum / howMany;

        System.out.println("The average is: " + average);

    }
}

