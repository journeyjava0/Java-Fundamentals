package labs_examples.objects_classes_methods.labs.methods;



import java.util.Arrays;

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
        System.out.println(largeSmall(10, 5, 25));

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
        int howMany = sample.length();
        char[] sampelC = sample.toCharArray();

        for (char s : sampelC) {
            if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
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

    public static int[] largeSmall(int ... num) {
        //return the largest of the numbers
        int theLargest = 0;
        int theSmallest = 0;
        int[] answer = new int[2];

        for (int a : num) {
            if (a > theLargest) {
                theLargest = a;
            }

            //how to find the smallest number?

        }return

    }
}





