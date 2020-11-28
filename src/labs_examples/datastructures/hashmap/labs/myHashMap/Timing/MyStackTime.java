package labs_examples.datastructures.hashmap.labs.myHashMap.Timing;

import java.util.Stack;

public class MyStackTime {
    public static void runTimeStack() {
        Stack<Integer> myStack = new Stack<>();
        Timer timeStack = new Timer("Stack");

        timeStack.startTimer();
        for (int i = 0; i < 100000; i++) {
            myStack.add(i);
        }
        timeStack.endTimer(timeStack.getStart());

        timeStack.startTimer();
        if(myStack.contains(9999)){
            timeStack.endTimer(timeStack.getStart());
        }

        timeStack.startTimer();
        myStack.clear();
        timeStack.endTimer(timeStack.getStart());

        timeStack.totalTime();
    }
}
