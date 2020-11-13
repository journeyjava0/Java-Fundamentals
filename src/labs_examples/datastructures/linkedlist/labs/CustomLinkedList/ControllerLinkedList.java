package labs_examples.datastructures.linkedlist.labs.CustomLinkedList;
//Exercise 2 from datastructures/linkedlist
/**
 *      LinkedLists - ControllerLinkedList
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

public class ControllerLinkedList {
    public static void main(String[] args) {
        MyListLinked<String> sportsCars = new MyListLinked();
        sportsCars.addToEnd("Porsche");
        sportsCars.addToEnd("Lamborghini");
        sportsCars.printCurrentList();
        System.out.println();
        sportsCars.addToFront("McLaren");
        sportsCars.printCurrentList();
        System.out.println();
        sportsCars.remove("Porsche");
        sportsCars.printCurrentList();
        sportsCars.remove("McLaren");
        sportsCars.printCurrentList();
        sportsCars.addToFront("R8");
        sportsCars.remove("Lamborghini");
        sportsCars.printCurrentList();
    }
}