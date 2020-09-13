package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {
    public static void main(String[] args) {

        try {
            priceCheck(0);
        } catch (PriceException exc){
           System.out.println(exc.getMessage());
        }
    }

    public static void priceCheck (int a) throws PriceException {
        if (a == 0) {
            PriceException wrongPrice = new PriceException("Wrong price");
            throw wrongPrice;
        }
        else System.out.println("Valid Price");
    }
}