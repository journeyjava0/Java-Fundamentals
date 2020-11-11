package labs_examples.datastructures.linkedlist.labs;

import java.util.*;

/**
 *      LinkedLists - MyFirstRunnable
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
    //1. Create a linked list
    LinkedList<String> myList = new LinkedList<>();

    //2. add item to linked list
    myList.add("Car");

    //3. Use addAll(), First need to create a collection
    Collection<String> collect = new ArrayList<>();
    collect.add("Truck");
    collect.add("Boat");
    collect.add("Train");
    //add collection to myList
    myList.addAll(collect);

    //4. addFirst() adds to first position of list
    myList.addFirst("Wagon");

    //5. addLast() adds to last position of list
    myList.addLast("Spaceship");

    //6. getFirst() gets first element in list
    System.out.println(myList.getFirst());

    //7. getLast() gets last element in list
    System.out.println(myList.getLast());

    //8. get() returns element at specified index
    System.out.println(myList.get(2));

    //9. set() changes the value of the element at the specified index
    myList.set(2, "SUV");
    System.out.println(myList.get(2)); //returns "SUV" instead of Truck (see #8)

    //10. push() adds to front of list
    myList.push("Bicycle");
    System.out.println(myList.get(0)); //returns bicycle

    //11. pop() removes and returns first element in the list
    System.out.println(myList.pop()); //Bicycle is no longer the first element in the list
    System.out.println(myList.get(0));

    //12. remove() can remove an element at an index or an object (in this case, "SUV")
    myList.remove(2);
    myList.remove("SUV");

    //13. contains() returns true if object is contained in list
    if (myList.contains("Wagon")){
        System.out.println("Wagon is still in the list");
    }

    //14. ListIterator () returns a list of elements starting from and including the specified index
        ListIterator<String> listItems = null;
        listItems = myList.listIterator(0);
        while(listItems.hasNext()){
            System.out.println(listItems.next());
        }

    //15. clear() removes all items from list
    myList.clear();
        if(myList.isEmpty()){
            System.out.println("List is empty");
        }
    }
}