package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.labs.ThreadPractice.Set1.MyRunnable1;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
class Exercise_01 {

    public static void main(String[] args) {
        System.out.println("Main thread Started");
        MyFirstRunnable thread1 = new MyFirstRunnable("First Thread Ever!");
        MyFirstRunnable thread2 = new MyFirstRunnable("Second thread");
        MyFirstRunnable thread3 = new MyFirstRunnable("Third thread");

        Thread t4 = new Thread(new MyRunnable1());
        t4.setName("fourth string");
        t4.start();

        System.out.println("Main thread ended");
    }
}
    //Question for Ryan: Why does this need to be static?
    class MyFirstRunnable implements Runnable {

        //Instantiate Thread class
        Thread thread;

        //Thread constructor
        public MyFirstRunnable(String name) {
            thread = new Thread(this, name);
            thread.start();
        }

        //Overriding the Runnable Method. This is what is executed when the thread starts.
        @Override
        public void run() {
            System.out.println(thread.getName() + " is starting");
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(300);
                    System.out.println(thread.getName() + " is running " + "iteration " + i);
                }
            } catch (InterruptedException exc) {
                System.out.println(thread.getName() + " was interrupted");
            }
            System.out.println(thread.getName() + " is terminating");
        }
    }

