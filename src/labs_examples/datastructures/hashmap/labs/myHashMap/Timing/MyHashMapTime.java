package labs_examples.datastructures.hashmap.labs.myHashMap.Timing;

import java.util.HashMap;

public class MyHashMapTime {
    public static void runTimeHashMap() {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        Timer timeHashMap = new Timer("HashMap");

        timeHashMap.startTimer();
        for (int i = 0; i < 100000; i++) {
            myHashMap.put(i, i + 1);
        }
        timeHashMap.endTimer(timeHashMap.getStart());

        timeHashMap.startTimer();
        if(myHashMap.containsKey(9999)){
            timeHashMap.endTimer(timeHashMap.getStart());
        }

        timeHashMap.startTimer();
        myHashMap.clear();
        timeHashMap.endTimer(timeHashMap.getStart());

        timeHashMap.totalTime();
    }
}
