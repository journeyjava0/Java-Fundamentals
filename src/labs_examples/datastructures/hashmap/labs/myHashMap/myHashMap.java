package labs_examples.datastructures.hashmap.labs.myHashMap;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;


public class myHashMap<K, V> {

    // create the underlying Entry array with the initial size of 10
    private Entry<K, V>[] table = new Entry[10];
    private int numElements = 0;

    private int hash(K key) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index = Math.abs(key.hashCode() % table.length);
        // the result will be the index where we can find and/or place entries
        return index;
    }

    public void add(K key, V value) {
        // call the hash() method to get the index to place the element
        int index = hash(key);

        // create the Entry object containing the key and value that we will store in the underlying array
        Entry<K,V> entry = new Entry(key, value);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (table[index] == null) {
            table[index] = entry;
            numElements++;
            return;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        //add to front of list
        else {
            Entry<K, V> head = table[index];
            entry.next = head;
            table[index] = entry;
            numElements++;
        }

        // check for resize
        if (numElements > table.length * .5) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            changeSize();
        }
    }

    private void changeSize() {
        // make a copy of the existing table and call it "old"
        Entry<K, V>[] old = table;
        // create a new Entry[] that is three times the size of the old one
        table = new Entry[old.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < old.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry entry = old[i];
                // call the put() method passing the key and value to add this element to the new table
                add((K) entry.getKey(), (V) entry.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry.next != null) {
                    // if it is, traverse to the next node
                    entry = entry.next;
                    // and call the put() method to add this element
                    add((K) entry.getKey(), (V) entry.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }


    public void erase (K key) {

        // otherwise, get the index for the key by calling the hash() method
        int index = hash(key);
        if(table[index] == null){
            return;
        }

        // get the Entry at the index
        Entry<K, V> entry = table[index];

        // if this entry has the matching key, remove the element at this index
        if (entry.getKey().equals(key)) {
            if (table[index].next == null) {
                table[index] = null;
                numElements--;
            } else {
                table[index] = table[index].next;
                numElements--;
            }
        }

        // otherwise, if the next element in the linked list is not null
        while (entry.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry.next.getKey() != key) {
                // traverse the linked list to the next node
                entry = entry.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry.next.next != null){
            entry.next = entry.next.next;
            numElements--;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry.next = null;
            numElements--;
        }
    }


    public V find(K key) {
        // call the hash() method to get the index for the key
        int index = hash(key);

        // nothing at key - return null
        if (table[index] == null) {
            System.out.println("Hash map is empty, nothing to find");
            return null;
        }

        // otherwise, get the Entry at the index
        Entry<K, V> entry = table[index];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry.getKey() != key) {

            // if we reach the end of the list and haven't found it return null
            if (entry.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry = entry.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry.getValue();
    }

    public int getStorage() {
        return table.length;
    }

}

class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        if(key == null){
            System.out.println("Unable to 'getKey', there is no element to get");
        }
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


