package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: My answer was 20, which is wrong. I now know that because B extends A, B takes a copy of the
 * variables from A which includes int i and even though an object a was created and set
 * equal to a new object B, B still extends A, which means i = 10.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}