package labs_examples.datastructures.linkedlist.labs.CustomDoubleLinkedList;

//creating custom doubly linked list

public class ControllerDoubleLinkedList {
    public static void main(String[] args) {
        MyDoubleLinkedList<String> myDoubleList = new MyDoubleLinkedList();
        myDoubleList.addToFront("One");
        myDoubleList.addToFront("Two");
        myDoubleList.addToFront("Three");
        myDoubleList.addToFront("Four");
        myDoubleList.printList(); //expecting Four, Three, Two, One
        myDoubleList.remove("Three");
        myDoubleList.printList();
    }
}
