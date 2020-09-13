package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {
        try {
            divide(4, 0);
        } catch (ArithmeticException esc){
            System.out.println("Error, dividing by 0");
        }
        System.out.println(divide(10,2));
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}