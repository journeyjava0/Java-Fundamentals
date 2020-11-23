package labs_examples.datastructures.queue.labs;
/**
 *      Queues - ControllerLinkedList
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */
public class CustomQueue<E> {
    //Initialize an new array of a Generic type
    Object[] myCustomQueue = (E[]) new Object[4];
    int latestIndex = 0;
    int firstIndex = 0;

    //returns the size of the array as an int
    public int getArraySize() {
        return myCustomQueue.length;
    }

    public void add(E item){
        setArraySize();
        myCustomQueue[latestIndex] = item;
        latestIndex++;
    }

    public E peekFirst() {

        return (E) myCustomQueue[firstIndex];
    }

    public E peekLast(){
        E answer;

        for(int i = 0; i < myCustomQueue.length; i++){
            if(myCustomQueue[i] == null && i > 0){
                answer = (E) myCustomQueue[i - 1];
                return answer;
            } else if (i == myCustomQueue.length && myCustomQueue[i] != null){
                return (E) myCustomQueue[i];
            }
        }
        return null;
    }

    public void setArraySize() {

        if (latestIndex >= myCustomQueue.length * .75) {
            int arraySize = myCustomQueue.length * 2;
            Object[] tempArray = myCustomQueue;
            myCustomQueue = (E[]) new Object[arraySize];
            for(int i = 0; i < tempArray.length; i++){
                myCustomQueue[i] = tempArray[i];
            }
        }

        //Decrease the size of the array based on # of !null elements
        else if (latestIndex <= myCustomQueue.length * .25){
            int count = 0;
            int arraySize = myCustomQueue.length / 2;
            Object[] tempArray = myCustomQueue;
            myCustomQueue = (E[]) new Object[arraySize];
            for(int i = 0; i<tempArray.length; i++){
                if(tempArray[i] != null){
                    myCustomQueue[count] = tempArray[i];
                    count ++;
                }
            }
        }
    }

    public void remove() {
        setArraySize();

        if (myCustomQueue[firstIndex] != null) {
            myCustomQueue[firstIndex] = null;
            firstIndex++;
        }
        else {
            System.out.println("List is empty, nothing more to delete!");
        }
    }

    public void printAll(){
        int count = 0;
        for(int i = 0; i < myCustomQueue.length; i++){
            if(myCustomQueue[i] != null){
                System.out.print(myCustomQueue[i] + ", ");
            } else if (myCustomQueue[i] == null){
                count ++;
            }
        }
        if (count == myCustomQueue.length){
            System.out.println("Nothing to print as the list is empty!");
        }
    }

    public void clearAll(){
        for(int i = 0; i < myCustomQueue.length; i++){
            myCustomQueue[i] = null;
        }
    }
}

