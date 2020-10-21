package labs_examples.lambdas.labs;

import java.text.DecimalFormat;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
public class Exercise_02 {
    public static void main(String[] args) {
        //BiFunction (1 of 10)
        BinaryOperator<Integer> addition = (Integer x, Integer y) -> {
            int sum = x + y;
            System.out.println("The sum of " + x + " + " + y + " is: " + sum);
            return sum;
        };
        addition.apply(10, 20);

        //Consumer (2 of 10)
        Consumer<String>  msg = (String str) -> {
            System.out.println("Your message was: " + str);
        };
        msg.accept("lambdas are cool!");

        //Supplier (3 of 10)
        Supplier<Double> someSupplier = () -> {
            double x = 10;
            System.out.println("Number provided was " + x);
            return x;
        };
        someSupplier.get();

        //DoubleToIntFunction (4 of 10)
        DoubleToIntFunction convertToInt = (double x) -> {
            int answer = (int) Math.ceil(x);
            System.out.println("Converting " + x + " to an int is: " + answer);
            return answer;
        };
        convertToInt.applyAsInt(10.49);

        //IntBinaryOperator (5 of 10)
        IntBinaryOperator multiply = (int a, int b) -> {
            int answer = a * b;
            System.out.println(a + " x " + b + " is: " + answer);
            return answer;
        };
        multiply.applyAsInt(10, 200);

        //Function (6 of 10)
        Function<Integer, Double> multiplyInt = (Integer x) -> {
            double answer = x * 50;
            System.out.println(x + " x " + 50 + " is: " + answer);
            return answer;
        };
        multiplyInt.apply(10);

        //BiConsumer (7 of 10)
        BiConsumer<String, String> names = (String first, String last) -> {
            System.out.println(first.toLowerCase() + " " + last.toUpperCase());
        };
        names.accept("BiLL", "jones");

        //ToDoubleBiFunction (8 of 10)
        ToDoubleBiFunction<Double, Double> howMuchTax = (Double price, Double tax) -> {
            DecimalFormat df = new DecimalFormat("0.00");
            double answer = price * tax;
            System.out.println(df.format(answer));
            return answer;
        };
        howMuchTax.applyAsDouble(50.82, .10);

        //IntPredicate (9 of 10)
        IntPredicate intValue = (int x) -> {
           boolean value = true;
            if (x > 10) {
                System.out.println(x + " is greater than 10");
                value = true;
            } else if (x < 10) {
                System.out.println(x + " is not greater than 10");
                value = false;
            }
            return value;
        };
        intValue.test(50);

        //ObjIntConsumer (10 of 10)
        ObjIntConsumer<Double> someMethod = (Double x, int y) -> {
            int answer = (int) (x + y);
            System.out.println(answer + " is returned as an integer when adding double + integer types");
        };
        someMethod.accept(10.25, 5);
    }
}