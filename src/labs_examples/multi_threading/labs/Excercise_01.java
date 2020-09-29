package labs_examples.multi_threading.labs;

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
        MyFirstRunnable thread1 = new MyFirstRunnable ("First Thread Ever!");
        MyFirstRunnable thread2 = new MyFirstRunnable ("Second thread");
        MyFirstRunnable thread3 = new MyFirstRunnable("Third thread");

        //TODO Slack this to Ryan
        //start a 4th thread in a different way than threads 1 to 3
        //Question for Ryan: How do I initiate a thread in a different way? Why doesn't thread 4 start?
        Thread thread4 = new Thread("thread 4");
        thread4.start();

        System.out.println("Main thread ended");
    }

    //Question for Ryan: Why does this need to be static?
    public static class MyFirstRunnable implements Runnable {

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
}
