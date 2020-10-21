package labs_examples.lambdas.labs.Ex1;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        //Step 1 & 2
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

    }
}