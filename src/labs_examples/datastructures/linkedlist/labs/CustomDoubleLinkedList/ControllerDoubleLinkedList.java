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
        myDoubleList.addToEnd("Five");
        myDoubleList.printList(); //expecting Four, Three, Two, One, Five
        myDoubleList.remove("Five");
        myDoubleList.printList();
        myDoubleList.remove("Two");
        myDoubleList.printList();//expecting four, three, one
    }
}
