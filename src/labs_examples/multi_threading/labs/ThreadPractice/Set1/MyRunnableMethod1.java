package labs_examples.multi_threading.labs.ThreadPractice.Set1;

import java.util.Scanner;

public class MyRunnableMethod1 {


    public synchronized void message() {
        System.out.println("Hello I'm " + Thread.currentThread().getName());
    }

    public synchronized void countNums() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " complete");
    }



}
