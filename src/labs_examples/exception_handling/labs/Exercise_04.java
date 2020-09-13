package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int nums[] = {1,2,4,0};

        //Is this actually a nested try/catch?
        try {
            System.out.println(nums[2]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Outside array bounds");
        } try {
            System.out.println(nums[1]/nums[3]);
        } catch (ArithmeticException exc2){
            System.out.println("Error, dividing by 0");
        }
    }
}