package labs_examples.datastructures.hashmap.labs.myHashMap.Timing;

import java.util.PriorityQueue;

public class MyQueueTime {
    public static void runTimeQueue() {
    PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();
    Timer myQueueTime = new Timer("Queue");

        myQueueTime.startTimer();
        for (int i = 0; i < 100000; i++) {
        myPriorityQueue.add(i);
        }
        myQueueTime.endTimer(myQueueTime.getStart());

        myQueueTime.startTimer();
        if(myPriorityQueue.contains(9999)){
        myQueueTime.endTimer(myQueueTime.getStart());
        }

        myQueueTime.startTimer();
        myPriorityQueue.clear();
        myQueueTime.endTimer(myQueueTime.getStart());

        myQueueTime.totalTime();
    }
}
