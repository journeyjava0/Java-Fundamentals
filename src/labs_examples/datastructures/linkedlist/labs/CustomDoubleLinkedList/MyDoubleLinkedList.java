package labs_examples.datastructures.linkedlist.labs.CustomDoubleLinkedList;

public class MyDoubleLinkedList<T> {
    private Node<T> head, tail;

    public MyDoubleLinkedList(T ... data) {
        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                addToFront(data[i]);
            }
        }
    }

    public boolean contains(T findItem) {
        Node<T> iterator = head;

        // iterate through list
        while (iterator != null) {
            if (iterator.data.equals(findItem)) {
                return true;
            }
        }
        return false;
    }

    public void addToFront(T data) {
        Node<T> iterator = head;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = iterator;
            newNode.prev = null;
            head = newNode;
        }
    }

    public void addToEnd(T data) {
        Node<T> iterator = head;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = newNode;
            newNode.prev = iterator;
        }
    }

    public void printList() {
        Node iterator = head;
        String output = "";

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        while(iterator != null){
            output += iterator.data + ", ";
            iterator = iterator.next;
        }
        System.out.println(output);
    }

    public void remove(T data) {
        Node<T> iterator = head;

        if (iterator == null) {
            return;
        } else {
            if (iterator.data.equals(data)) {
                head = iterator.next;
                iterator.prev = null;
                return;
            }
            while (iterator.next != null) {
                iterator = iterator.next;
                iterator.prev = iterator;

                if (iterator.next.data.equals(data)) {
                    if (iterator.next.next != null) {
                        iterator.next = iterator.next.next;
                        iterator.prev = iterator.next;
                        return;
                    }
                    iterator.next = null;
                    iterator.prev = iterator.prev.prev;
                }
            }
        }
    }
}
