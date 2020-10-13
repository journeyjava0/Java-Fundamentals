package labs_examples.generics.labs.Ex03;

import java.util.*;

// Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

//TODO this counts accurately, however it lists every appearance of the 'String'
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("bob");
        list.add("radar");
        list.add("radar");
        list.add("billy");
        list.add("rAdar");

        palindrome(list);
    }

    public static <E extends String> void palindrome(ArrayList<E> e) {
        Set<String> st = new HashSet<String>(e);

        //Since we just need to find palindromes, it's the same letters forward and backwards :)
        //TODO, however, this is case senstitive so 'radar' and 'rAdar' are counted separately
        //Need to find out how to ingore case on a HashSet
        //Used HashSet to solve the 'repeating' issue
        for (String s : st) {

                System.out.println(s + " appears " + Collections.frequency(e, s) + " times");
            }
                //System.out.println(s + " appears " + Collections.frequency(e, s) + " times");
    }
}



