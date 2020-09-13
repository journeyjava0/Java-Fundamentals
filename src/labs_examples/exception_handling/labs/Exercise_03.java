package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,0};

        try{
            System.out.println(nums[2] / nums[3]);
        } catch (ArithmeticException exc){
            System.out.println("Error, cannot divide by 0");
        } finally {
            System.out.println("All done :)");
        }
    }
}