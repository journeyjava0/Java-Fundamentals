package labs_examples.datastructures.hashmap.labs.myHashMap.Timing;

import java.util.LinkedList;

public class MyLinkedListTime {
    public static void runTimeLinkedList() {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        Timer timeLinkedList = new Timer("Linked List");

        timeLinkedList.startTimer();
        for (int i = 0; i < 100000; i++) {
            myLinkedList.add(i);
        }
        timeLinkedList.endTimer(timeLinkedList.getStart());

        timeLinkedList.startTimer();
        if(myLinkedList.contains(9999)){
            timeLinkedList.endTimer(timeLinkedList.getStart());
        }

        timeLinkedList.startTimer();
        myLinkedList.clear();
        timeLinkedList.endTimer(timeLinkedList.getStart());

        timeLinkedList.totalTime();
    }
}
