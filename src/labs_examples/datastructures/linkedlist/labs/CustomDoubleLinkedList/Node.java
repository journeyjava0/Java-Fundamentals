package labs_examples.datastructures.linkedlist.labs.CustomDoubleLinkedList;

public class Node<T> {
    T data;
    Node next;
    Node prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

