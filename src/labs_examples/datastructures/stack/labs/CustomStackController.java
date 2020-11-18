package labs_examples.datastructures.stack.labs;

public class CustomStackController {
    public static void main(String[] args) {
    CustomStackArray<String> myStack = new CustomStackArray<>();
        myStack.push("cat");
        myStack.push("dog");
        myStack.push("bird");
        myStack.push("car");


        System.out.println("First element is: " + myStack.peekFirst() + "\n"); // cat
        myStack.pop(); // remove car
        System.out.println("Last element is: " + myStack.peekLast() + "\n"); // bird
        System.out.println("All items remaining are: ");
        myStack.printAll(); //cat, dog, bird
    }
}
