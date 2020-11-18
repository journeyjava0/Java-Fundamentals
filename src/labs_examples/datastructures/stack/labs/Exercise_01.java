package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {

    public static void main(String[] args) {
    Stack<String> myStack = new Stack<>();
    myStack.push("cat");
    myStack.push("dog");
    myStack.pop();
    System.out.println(myStack.peek());
    myStack.empty();
    myStack.search(1);

    }
}