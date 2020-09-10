package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {

    public static void main(String[] args) {
        int[] nums = {2,4,6};

        try{
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException esc){
            System.out.println("Error, index not in array");
        }
    }
}
