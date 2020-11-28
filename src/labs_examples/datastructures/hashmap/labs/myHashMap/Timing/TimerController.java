package labs_examples.datastructures.hashmap.labs;

import sun.misc.Queue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

public class Exercise_03 {
    public static void main(String[] args) {


        Queue<Integer> myQueue = new Queue<>();
        HashMap<Integer, Integer> myHashMap = new HashMap<>();


        //LinkedList timer
        runTimeLinkedList();

        System.out.println(" ");
        //Stack timer


    }

  public static void runTimeLinkedList() {
      LinkedList<Integer> myLinkedList = new LinkedList<>();
      Timer timeLinkedList = new Timer("Linked List");

      timeLinkedList.startTimer();
      for (int i = 0; i < 10000; i++) {
          myLinkedList.add(i);
      }
      timeLinkedList.endTimer(timeLinkedList.getStart());

      //don't need another for loop just do an if contains
      timeLinkedList.startTimer();
      if(myLinkedList.contains(9999)){
          timeLinkedList.endTimer(timeLinkedList.getStart());
      }



//TODO figure out why this doesn't run ... line 66 doesn't execute
      //need to add a printout to track delete time or
      timeLinkedList.startTimer();
      myLinkedList.clear();
      timeLinkedList.endTimer(timeLinkedList.getStart());

      timeLinkedList.totalTime();

  }
}
