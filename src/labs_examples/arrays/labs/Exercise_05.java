package labs_examples.arrays.labs;

import java.util.ArrayList;




/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        String[] source = {"a","b","c","d", "e", "f"};

        for (int i = source.length - 1; i>=0; i--){
            if (i%2 == 1) {
                System.out.print(source[i] + " ");
            }
        }
    }
}
