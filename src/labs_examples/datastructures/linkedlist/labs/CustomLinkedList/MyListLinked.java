package labs_examples.datastructures.linkedlist.labs.CustomLinkedList;

public class MyListLinked<T> {
    private Node<T> head;

    public MyListLinked(T... data) {
        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                addToEnd(data[i]);
            }
        }
    }

    //This is a helper method to determine if an item is found in the list
    //and keeps track of how many times that item occurs in the list
    //ignoring upper/lower case
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

    public int countOccurences(T findItem) {
        Node<T> iterator = head;
        int count = 0;

        // iterate through list
        while (iterator != null) {
            if (iterator.data.toString().equals(findItem)) {
                count++;
            }
            iterator = iterator.next;
        }
        return count;
    }

    //Helper method to print out all items in the list
    public void printCurrentList() {
        Node iterator = head;
        String output = "";

        // iterate through list
        while (iterator != null) {
            output += iterator.data + ", ";
            iterator = iterator.next;
        }
        System.out.println(output);
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
        }
    }

    public void addToFront(T data) {
        Node<T> iterator = head;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = iterator;
            head = newNode;
        }
    }

    //keeping this 'get' method here in case I need it
    public T get(int index) {
        //original public T get(int index) {
        try {
            // simple variable to use for looping over the list
            int count = 0;
            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;
            // iterate until index is reach
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;
        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    //This returns value based on Node's value, not it's index
    //this is like the 'get' method, except it uses the nodes value as String type only
//    public T find (String item) {
//        // iterate through list
//        try {
//            boolean wasFound = false;
//            Node iterator = head;
//            String found = " ";
//                while (iterator != null) {
//                    if (iterator.data.toString().equalsIgnoreCase(item)) {
//                    iterator.data = found;
//                    wasFound = true;
//                    }
//                iterator = iterator.next;
//                }
//            if(wasFound){
//                System.out.println(item + " was found");
//            } else System.out.println(item + " not found");
//            return (T) found;
//        } catch (NullPointerException ex){
//        return null;
//        }
//    }

    public T find(T item) {
        try {
            boolean wasFound = false;
            Node iterator = head;

            while (iterator != null) {
                if (iterator.data == item) {
                    wasFound = true;
                }
                iterator = iterator.next;
            }
            if (wasFound) {
                System.out.println(item + " was found");
                return item;
            } else System.out.println(item + " not found");
            return null;
        } catch (NullPointerException ex) {
            return null;
        }
    }

    public void remove(T data) {
        Node<T> iterator = head;

        if (iterator == null) {
            return;
        } else {
            if (iterator.data.equals(data)) {
                head = iterator.next;
                return;
            }
            while (iterator.next != null) {

                if (iterator.next.data.equals(data)) {
                    if (iterator.next.next != null) {
                        iterator.next = iterator.next.next;
                        return;
                    }
                    iterator.next = null;
                }
            }
        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }
        return count;
    }
}
