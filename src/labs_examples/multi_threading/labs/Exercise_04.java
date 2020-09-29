package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Hello");
        MyThread thread2 = new MyThread("Good bye");
        MyThread thread3 = new MyThread("That's all folks!");
    }

   //A class for a Greeting with a method that displays a simple message
   static class Greeting {
        public void sayMessage (String msg){
            System.out.println("The message is " + msg);
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println("Thread interrupted");
            }
            System.out.println("Message was displayed was " + msg);
        }
    }
    //Thread class + implementing Runnable interface
    static class MyThread implements Runnable{
        Thread thread;
        String msg;
        Greeting greeting;


        MyThread(String msg) {
           thread = new Thread (this, msg);
           thread.start();
        }

        @Override
        public void run() {
            //Where is the greeting object instantiated? Why do I get an error here?
            synchronized (greeting){
                greeting.sayMessage(msg);
            }
        }
    }
}