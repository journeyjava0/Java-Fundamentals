package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;
import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {
        //1. Example of Overloading
        System.out.println("This is an example of overloading");

        //2. pass by value
        int a = 10;
        int b = 15;
        System.out.println(minus(a, b)); // output 18
        System.out.println(a + " " + b); // output: a = 10, b = 15

        //2. pass by reference
        Car myCar = new Car(50, "blue", "dodge");
        System.out.println("Car color is " + myCar.getColor()); //prints blue
        myCar.setColor("red"); //is this pass be reference?

        MethodTraining ex = new MethodTraining();
        ex.changeCarColor(myCar);
        System.out.println("Car color is now " + myCar.getColor()); // prints white
        //any reference to myCar.color from here on will now return white


        //3. largest of four numbers; assuming they're all positive
        int largestNum = largest(11, 20, 3, 4);
        System.out.println("The largest number is " + largestNum);

        //4. Counting consonants
        String sample = "thething";
        System.out.println("There are " + countConsonants(sample) + " consonants in " + "'" + sample + "'");

        //5. Printing ASCII art
        asciiArt();

        //6. is it a prime number?
        System.out.println(isPrime(7));

        //7. Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        // which is passed in as an argument
        int[] values = {1,10,9,4,20};
        System.out.println(largeSmall(values));

//        8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//                In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//        length of the returned list
        int maxNum = 10;
        int divisor1 = 3;
        int divisor2 = 2;

        int args3Length = args3(maxNum, divisor1, divisor2).size();
        System.out.println(args3(maxNum, divisor1, divisor2) + " and length of the list is " + args3Length );

//    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array
        int[] someArray = {1,2,3,4,5,6,7,8,9,10};
        reverse(someArray);
    }

    public static void reverse (int[] numsArray) {
        int temp = 0;
        for(int i = 0; i < numsArray.length/2; i ++){
            temp = numsArray[i];
            numsArray[i] = numsArray[numsArray.length - (i + 1)];
            numsArray[numsArray.length -(i + 1)] = temp;
        }
        System.out.println(Arrays.toString(numsArray));
    }

    public static ArrayList<Integer> args3 (int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0; i <= maxNum; i++){
            if(i % divisor1 == 0 && i % divisor2 == 0) {
                numList.add(i);
            }
        }
        return numList;
    }


    public static int largest(int a, int b, int c, int d) {
        //return the largest of the four numbers
        int[] myArray = {a, b, c, d};
        int theLargest = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > theLargest) {
                theLargest = myArray[i];
            }
        }
        return theLargest;
    }

    public static int countConsonants(String sample) { //what if the string is two words or more? how to account
                                                       // for the space between words?
        int howMany = sample.length(); //seemed easiest to subtract 1 from the total length (all letters)
                                       //each time a vowel is found. Doesn't work if there's a space or any chars that are not a vowel or a consonant
        char[] sampelC = sample.toCharArray();

        for (char s : sampelC) {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') { //had an assist from google on the logical expression
                howMany--;
            }
        } return howMany;
    }

    public static int minus (int a, int b) {
        a = 2;
        b = 20;
        return b - a;
    }

    public void changeCarColor (Car carColor) {
        carColor.setColor("white");
    }

    //ASCII art
    public static void asciiArt () {
        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < 2; a++) {
                System.out.println("*************");
                System.out.println("-------------");
            }
        }
        System.out.println ("    /:''|    ");
        System.out.println ("   |: 66|_   ");
        System.out.println ("   C     _)  ");
        System.out.println ("    \\ ._|      ");
        System.out.println ("     ) /       ");
        System.out.println ("   /`\\       ");
        System.out.println ("   || |Y|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   || |#|       ");
        System.out.println ("   :| |=:       ");
        System.out.println ("   ||_|,|      ");
        System.out.println ("   \\)))||     ");
        System.out.println ("|~~~`-`~~~|   ");
        System.out.println ("|         |    ");
        System.out.println ("|_________|    ");
        System.out.println ("|_________|    ");
        System.out.println ("    | ||       ");
        System.out.println ("    |_||__        ");
        System.out.println ("    (____))    ");
    }

    public static String isPrime (int a) {
        String prime = " ";

        if(a % 2 == 0) {
            prime = "it's not a prime #";
        } else prime = "it's a prime #";
        return prime;
    }

    public static String largeSmall(int[] num) {
        //return the largest of the numbers
        int theLargest = 0;
        int theSmallest = 0;
        int[] answer = new int[2];

        //Find largest number
        for (int a : num) {
            if (a > theLargest) {
                theLargest = a;
            }
        }

        //how to find the smallest number?
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) //had to look up the next 4 lines on google, did not figure it out on my own!
            if (num[i] < num[j]){ //I don't understand why I need a nested for loop to find smallest when I didn't need it to find the largest
                                  //why do I need the next 3 lines? I did the debugger and step over but it's still not quite clear
                                  //what's happening or why
                theSmallest = num[i];
                num[i] = num[j];
                num[j] = theSmallest;
            }
        }

        //Add lowest and highest number to array and then print that array
        answer[0] = theSmallest;
        answer[1] = theLargest;
        String myAnswer = Arrays.toString(answer);
        return "Smallest number first then largest number: " + myAnswer;
    }
}





