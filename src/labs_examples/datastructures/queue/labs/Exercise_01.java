package labs_examples.datastructures.queue.labs;

import java.util.*;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue= new PriorityQueue<>();
        myQueue.add("Poplar");
        myQueue.add("Spruce");
        myQueue.add("Cedar");

        for(String s : myQueue){
            System.out.println(s);
        }

        String first = myQueue.peek();
        System.out.println(first);

        boolean exists = myQueue.contains("Spruce");
        System.out.println("Spruce contained in queue -> " + exists);

        String removeFirst = myQueue.poll();
        System.out.println(removeFirst);

        for(String s : myQueue){
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println(" ---new line ---");

        myQueue.remove(); // removes cedar
        for(String s : myQueue){
            System.out.println(s);
        }
        System.out.println("Cedar has been removed");

        System.out.println("Size of queue: " + myQueue.size());

        myQueue.clear();
    }
}
