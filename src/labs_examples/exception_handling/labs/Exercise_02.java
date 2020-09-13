package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,3};

        try{
            System.out.println(5 / nums[2]);
        } catch(ArithmeticException exc){
            System.out.println("Error, cannot divide by 0");
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Error, index not in array");
        }
    }
}


