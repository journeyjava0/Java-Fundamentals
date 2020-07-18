package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(2,4));
        System.out.println(divide(100,10));
        joke();
        System.out.println(years(1980));
        System.out.println(howLong(10,12,15));
    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide (int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke (){
        String funny = "What do you call a colt with a sore throat? A: 'a little horse' :)";
        System.out.println(funny);
        return funny;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long years (int years){
        /* Note: Not sure which way I was supposed to calculate the seconds; this doesn't account for leap years!
        long a = (years - 1970) * 365 * 24 * 60 * 60;
        return a;
        */

        //Step 1: Need to figure out how to get the original java year
        long b = System.currentTimeMillis()/1000; // provides seconds since 1970 to current date (including
        //the day and hour, not just the year so this is more accurate than line 42 and it doesn't matter
        //if a leap year occurred, since we're counting seconds and not days

        //Step 2: Compare the int years from the java original year and convert to seconds
        int convert = 2020 - years;
        long seconds = convert * 365 * 24 * 60 * 60; //still doesn't account for leap years.

        //convert seconds form 1970 to current year
        return b - seconds; //returned a long so I don't end up with negative numbers when converting to int
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int howLong(int...v){
        int count = 0;
        for(int a : v) { //is there a way to do this using .length since it's an array?
            count++;
        } return count;
    }
}
