package labs_examples.datastructures.stack.labs;

//Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure

public class CustomStackArray<E> {

    //Initialize an new array of a Generic type
    Object[] myStackArray = (E[]) new Object[10];
    int latestIndex = 0;



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
    public void setArraySize() {


        //Increase the size of the array based on # of !null elements in the array
        //more specifically, resize the Stack (the underlying array) to be twice the size when the Stack is
        //more than 3/4 full
        if (latestIndex >= myStackArray.length * .75) {
            int arraySize = myStackArray.length * 2;

            //Step 1: Make a copy of the current array in a temp array
            //create an empty array called tempArray which is same length as myStackArray
            Object[] tempArray = myStackArray;

            //Step 2: Copy the elements from myStackArray into tempArray
//            for(int i = 0; i < myStackArray.length; i++){
//                tempArray[i] = myStackArray[i];
//            }

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
        else if (latestIndex <= myStackArray.length * .25){
            int count = 0;
            int arraySize = myStackArray.length / 2;
            Object[] tempArray = myStackArray;
            myStackArray = (E[]) new Object[arraySize];
            for(int i = 0; i<tempArray.length; i++){
                if(tempArray[i] != null){
                    myStackArray[count] = tempArray[i];
                    count ++;
                }
            }

        }
        //Step 1: Count how many null items are in the array by subtracting the number of !null items (i.e. countItems)
        //from the current array length, this should save from having to do another for loop

    }

    public void push(E item) {
        //it makes sense to call the setArraySize method here so that as items are added to the array
        //the size can be adjusted. First check array size and if it meets criteria, change the size
        //before adding any elements, this should avoid an 'array full' error. However, still added a try/catch
        //since the array size is fixed, based on the design of this code (i.e. resize the Stack (the underlying array)
        //to be twice the size when the Stack is more than 3/4 full resize the Stack (the underlying array) to be half
        //the size when the Stack is more than 1/4 empty



        //TODO need some sort of check to see if the array is full and then send a message to the user
        //the try catch doesn't execute for some reason

        myStackArray[latestIndex] = item;
        latestIndex ++;
        setArraySize();
    }

    public void printAll() {
        for (int i = 0; i < myStackArray.length; i++) {
            if (myStackArray[i] != null) {
                System.out.print(myStackArray[i] + ", ");
            }
        }
    }

    public E pop() {
        int index = 0;
        //it makes sense to call the setArraySize method here so that as items are removed from the array
        //the size can be adjusted. First check array size and if it meets criteria, change the size
        //before removing any elements, this should avoid an 'array empty' error. However, still added a try/catch
        //since the array size is fixed, based on the design of this code (i.e. resize the Stack (the underlying array)
        //to be twice the size when the Stack is more than 3/4 full and resize the Stack (the underlying array) to be
        //half the size when the Stack is more than 1/4 empty

        setArraySize();
        try {
            E obj = (E) myStackArray[latestIndex -1];
            myStackArray[latestIndex -1] = null;
            latestIndex--;
            return obj;
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
