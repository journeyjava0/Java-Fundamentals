package labs_examples.lambdas.labs.Ex1;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        //Steps 1 & 2
        MyInterface1 myInterface1 = () -> {
            System.out.println("First Lambda!");
        };
        myInterface1.myMethod1();

        //Step 2: Anonymous inner class from MyInterface1
        MyInterface1 obj = new MyInterface1() {
            @Override
            public void myMethod1() {
                System.out.println("My second lambda!");
            }
        };
        obj.myMethod1();

        //Step 3 and 4 lambda w/ one param as return & anonymous inner class
            //First the lambda expression
        MyInterfaceOneParam obj1 = (String str) -> {
            System.out.println(str);
            return str;
        };
        obj1.message("Hello Lambdas!");

            //now as an anonymous inner class
        MyInterfaceOneParam obj2 = new MyInterfaceOneParam() {
            @Override
            public String message(String str) {
                System.out.println(str);
                return str;
            }
        };
        obj2.message("I was created from an anonymous inner class!");

        //Step 5: Interface w/ 2 paramaters and returns a value. First lambda then anonymous inner class
        TwoParamInterface twoParamInterface = (int x, int y) -> {
            int add = x + y;
            System.out.println("Sum of " + x + " + " + y + " is: " + add);
            return add;
        };
        twoParamInterface.sum(5,10);
            //As an anonymous inner class
        TwoParamInterface obj3 = new TwoParamInterface() {
            @Override
            public int sum(int x, int y) {
                int add = x + y;
                System.out.println("Using an anonymous inner class, " + x + " + " + y + " is: " + add);
                return add;
            }
        };
        obj3.sum(10, 500);

        //Step 7: Use two of the built in functional interfaces
        Predicate<Integer> someInt = (Integer x) ->{
            boolean value = true;

            if(x > 10){
                System.out.println(x + " is greater than 10");
                value = true;
            } else if (x < 10) {
                System.out.println(x + " is less than 10");
                value = false;
            }
            return value;
        };
        //Calling the lambda from the main method
        //TODO: Note to self, the built in interfaces have their own method calls, for instant for Predicate, you invoke
        //the method using 'test' and for Function you invoke the method using 'apply'.
        someInt.test(4);

        //Let's try the Function interface
        Function<String, String> functionPractice = (String str) -> {
            System.out.println(str.toUpperCase());
            return str;
        };
        functionPractice.apply("Hello, I was created from a built-in interface using a lambda expression!");
    }
}