package labs_examples.datastructures.stack.labs;

//Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure

public class CustomStackArray<E> {

    //Initialize an new array of a Generic type
    Object[] myStackArray = (E[]) new Object[10];

    //returns the size of the array as an int
    public int getArraySize() {
        return myStackArray.length;
    }

    public E peekFirst() {
       return (E) myStackArray[0];
    }

    public E peekLast(){
        E answer;

        for(int i = 0; i < myStackArray.length; i++){
            if(myStackArray[i] == null && i > 0){
                answer = (E) myStackArray[i - 1];
                return answer;
            } else if (i == myStackArray.length && myStackArray[i] != null){
                return (E) myStackArray[i];
            }
        }
        return null;
    }

    //This method will increase or decrease the size of the array based on how full or empty the array
    //currently is
    public int setArraySize() {
        int arraySize = 4;
        int countItems = 0;

        for (int i = 0; i < myStackArray.length; i++) {
            if (myStackArray[i] != null) {
                countItems++;
            }
        }

        //Increase the size of the array based on # of !null elements in the array
        //more specifically, resize the Stack (the underlying array) to be twice the size when the Stack is
        //more than 3/4 full
        if (countItems >= 7) {
            arraySize = 20;

            //Step 1: Make a copy of the current array in a temp array
            //create an empty array called tempArray which is same length as myStackArray
            Object[] tempArray = myStackArray;

            //Step 2: Copy the elements from myStackArray into tempArray
            for(int i = 0; i < myStackArray.length; i++){
                tempArray[i] = myStackArray[i];
            }

            //Step 3: this will change the size of the array based on # of countItems that are !null
            myStackArray = (E[]) new Object[arraySize];

            //Step 3: copy the elements from tempArray to myStackArray which now has a different size
            for(int i = 0; i < tempArray.length; i++){
                myStackArray[i] = tempArray[i];
            }
            //System.out.println("increasing array size"); //just to see if this part of code is actually executed
            //which it is :)
        }

        //Decrease the size of the array based on # of !null elements
        //more specifically resize the Stack (the underlying array) to be half the size when the Stack is
        //more than 1/4 empty

        //Step 1: Count how many null items are in the array by subtracting the number of !null items (i.e. countItems)
        //from the current array length, this should save from having to do another for loop

        return arraySize;
    }

    public void push(E item) {
        //it makes sense to call the setArraySize method here so that as items are added to the array
        //the size can be adjusted. First check array size and if it meets criteria, change the size
        //before adding any elements, this should avoid an 'array full' error. However, still added a try/catch
        //since the array size is fixed, based on the design of this code (i.e. resize the Stack (the underlying array)
        //to be twice the size when the Stack is more than 3/4 full resize the Stack (the underlying array) to be half
        //the size when the Stack is more than 1/4 empty

        setArraySize();

        //TODO need some sort of check to see if the array is full and then send a message to the user
        //the try catch doesn't execute for some reason

        try {
            for (int i = 0; i < myStackArray.length; i++) {
                if (myStackArray[i] == null) {
                    myStackArray[i] = item;
                    return;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array is full, array size needs to be increased");
        }
    }

    public void printAll() {
        for (int i = 0; i < myStackArray.length; i++) {
            if (myStackArray[i] != null) {
                System.out.print(myStackArray[i] + ", ");
            }
        }
    }

    public Object pop() {
        int index = 0;
        //it makes sense to call the setArraySize method here so that as items are removed from the array
        //the size can be adjusted. First check array size and if it meets criteria, change the size
        //before removing any elements, this should avoid an 'array empty' error. However, still added a try/catch
        //since the array size is fixed, based on the design of this code (i.e. resize the Stack (the underlying array)
        //to be twice the size when the Stack is more than 3/4 full and resize the Stack (the underlying array) to be
        //half the size when the Stack is more than 1/4 empty
        setArraySize();

        try {
            for (int i = 0; i < myStackArray.length; i++) {
                //if the array is not full, then find the first null element and then change the one to its left to null
                if (myStackArray[i] == null) {
                    index = i - 1;
                    return myStackArray[index] = null;
                    //if the array is full, then set the last element to null
                } else if (myStackArray[myStackArray.length - 1] != null) {
                    index = myStackArray.length;
                    return myStackArray[index - 1] = null;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Nothing more to delete as the list is empty");
        }
        return null;
    }

    public E getItem(int index) {
        E found;
        //Iterate through myStackArray until match is found, if match is found return value at the index
        //if match is not found, return null
        for (int i = 0; i < myStackArray.length; i++) {
            if (i == index) {
                found = (E) myStackArray[i];
                return found;
            }
        }
        System.out.println("Item does not exist in the list");
        return null;
    }

    public boolean empty() {
        boolean isArrayEmpty = true;
        //If myStackArray.length > 0 than it's not empty

        if (myStackArray.length == 0) {
            isArrayEmpty = true;
        } else isArrayEmpty = false;
        return isArrayEmpty;
    }
}
