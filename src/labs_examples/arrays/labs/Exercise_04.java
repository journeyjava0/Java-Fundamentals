package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] nums = {{5,2,4}, {1,2}, {3,4,0}};

        for (int[] outer : nums) {
            for (int result : outer) {
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
