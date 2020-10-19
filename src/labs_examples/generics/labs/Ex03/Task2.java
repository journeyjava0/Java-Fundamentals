package labs_examples.generics.labs.Ex03;

import java.util.*;

// Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("bob");
        list.add("raDar");
        list.add("radar");
        list.add("billy");
        list.add("rAdar");
        list.add("jill");
        list.add("rAdar");

        palindrome(list);
    }

    public static <E extends String> void palindrome(ArrayList<E> e) {

        String a = " ";
        ArrayList<String> myList = new ArrayList<>();
        //Convert to lower case
        for (String s : e) {
            a = s.toLowerCase();
            myList.add(a);
        }
        String input = " ";
        ArrayList<String> answers = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {
           input = (myList.get(i) + " appears " + Collections.frequency(myList, myList.get(i)) + " times");
           answers.add(input);
        }

        for (int i = 0; i < answers.size(); i++) {
            if (i + 1 <= answers.size() && answers.get(i).equals(answers.get(answers.size() - (answers.size() -1)))) {
                answers.remove(i);
            }
        }
            System.out.println(answers.toString());

        
    }
}

