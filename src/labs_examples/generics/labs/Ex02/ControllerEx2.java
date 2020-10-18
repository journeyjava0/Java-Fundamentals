package labs_examples.generics.labs.Ex02;

import java.util.ArrayList;

public class ControllerEx2 {
    public static void main(String[] args) {

        //Try type double
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(2.0);
        list1.add(4.0);
        list1.add(1.1);
        System.out.println(sum(list1));

        //Try type integer
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            list2.add(i);
        }
        System.out.println(sum(list2));
    }

    //Change method return type as required ... chose int for fun :)
    public static <N extends Number> double sum (ArrayList<N> n){
       double x = 0;

       for(int i = 0; i < n.size(); i++){
           x += n.get(i).doubleValue();
       }
       return x;
    }
}

