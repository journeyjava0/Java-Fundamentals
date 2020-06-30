package labs_examples.arrays.labs;



import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> stuff = new ArrayList<>();

        stuff.add("animals");
        stuff.add("books");
        stuff.add("cars");

        System.out.println(stuff.get(0)); //prints element at index 0

        System.out.println("Items in the array list are: " + stuff);
    }
}
