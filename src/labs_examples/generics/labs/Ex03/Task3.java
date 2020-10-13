package labs_examples.generics.labs.Ex03;

// 3) Write a generic method to exchange the positions of two different elements in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Let's try an Integer[]
        Integer[] numsArr = {1,2,3,4,5};
        changePosition(numsArr);

        //Let's try a String[]
        String[] cars = {"Lambo", "Porche", "Ferrari", "McClaren"};
        changePosition(cars);
    }

    public static <E> void changePosition(E[] e){
        System.out.println("Original order:");
        String a = Arrays.toString(e);
        System.out.println(a);

        ArrayList<E> arrList = new ArrayList<>();
        for(int i = 0; i < e.length; i++){
            arrList.add(e[i]);
        }

        System.out.println("New order " + "'" + arrList.get(arrList.size() -1) + "'" + " is first and " + "'" +
                arrList.get(0) + "'" + " is now last:");
        E last = arrList.get(arrList.size() - 1);
        E first = arrList.get(0);
        arrList.remove(arrList.get(arrList.size() -1));
        arrList.remove(arrList.get(0));
        arrList.add(0, last);
        arrList.add(arrList.size(), first);

        System.out.println(arrList.toString());
    }
}
