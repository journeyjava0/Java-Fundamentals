package labs_examples.datastructures.stack.labs;

//Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure

public class CustomStackArray<E>{

    //TODO Ask Ryan: How to fix 'array intializer expected' error on next line
    E[] myStackArray = new E[];

    public void push (E item){
        myStackArray[0] = item;
    }

    public void pop () {
        myStackArray[0] = null;
    }

    public E getItem(int index){
        E found = (E) " ";

        for(int i = 0; i < myStackArray.length; i++){
            if(i == index){
                found = myStackArray[i];
            }
            else found = (E) "not found :(";
        }
        return found;
    }

    public boolean empty(){
        boolean isArrayEmpty = true;

        if (myStackArray.length > 0){
            isArrayEmpty = false;
        }
        return isArrayEmpty;
    }

}
