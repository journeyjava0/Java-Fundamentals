package labs_examples.multi_threading.labs.Exercise_04;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Greeting greet = new Greeting();
        MyThread thread1 = new MyThread("Hello", greet);
        MyThread thread2 = new MyThread("Good bye", greet);
        MyThread thread3 = new MyThread("That's all folks!", greet);
        Ryan obj = new Ryan();
        Thread t = new Thread(obj);
        t.start();
    }
}


