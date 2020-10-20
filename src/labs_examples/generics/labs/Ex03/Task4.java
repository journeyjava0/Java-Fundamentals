package labs_examples.generics.labs.Ex03;

//4) Write a generic method to find the largest element within the range (begin, end) of a list.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Integer[] list = {1,50,2,500,3};
        Double[] test2 = {1.2, 3.4, 1.9};
        findLargest(list);
        findLargest(test2);
    }

    //TODO Ask Ryan: the code works, but only for an Integer[] and not a generic method or list
    //as soon as I use generics, I get an error:  operator '>' cannot be applied to 'E', 'E'
    public static <E extends Number> void findLargest (E[] e){
        double largest = 0;

        for(int i = 0; i < e.length - 1; i++){

                if (e[i].doubleValue() > e[i + 1].doubleValue()){
                    largest = e[i].doubleValue();
                    i++;
                } else largest = e[i + 1].doubleValue();
            }
        System.out.println("Largest number in " + Arrays.toString(e) + " is: " + largest);
}
}