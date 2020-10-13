package labs_examples.generics.labs.Ex03;
 /* Write a generic method that accepts two generic arguments. This generic method should only accept
arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
numbers were passed in regardless of their type. */

public class Task1 {

    public static void main(String[] args) {
        System.out.println(sum(12, 10));
    }

    static <E extends Number> double sum(E num1, E num2){
        double total = num1.doubleValue() + num2.doubleValue();
        return total;
     }
}
