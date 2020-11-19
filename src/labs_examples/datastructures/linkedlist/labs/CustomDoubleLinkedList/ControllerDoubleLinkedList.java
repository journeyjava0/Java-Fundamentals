package labs_examples.datastructures.linkedlist.labs.CustomDoubleLinkedList;

//creating custom doubly linked list

public class ControllerDoubleLinkedList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        MyDoubleLinkedList<String> myDoubleList = new MyDoubleLinkedList();
        myDoubleList.addToEnd("One");
        myDoubleList.addToEnd("Two");
        myDoubleList.addToEnd("Three");
        myDoubleList.addToEnd("Four");
        myDoubleList.printList(); //expecting Four, Three, Two, One
        myDoubleList.addToEnd("Five");
        myDoubleList.printList(); //expecting Four, Three, Two, One, Five
        myDoubleList.printNeighbours("One");
        myDoubleList.printNeighbours("Three");
        myDoubleList.printNeighbours("Five");
//        myDoubleList.remove("Five");
//        myDoubleList.printList();
//        myDoubleList.remove("Two");
//        myDoubleList.printList();//expecting four, three, one
//        long endTime = System.currentTimeMillis();
//        long diff = endTime - startTime;
//        System.out.println(diff);
    }
}
