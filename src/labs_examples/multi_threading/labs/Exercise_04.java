package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

//Question for Ryan: This seems to work, but why? Can we walk through this?
//Interstingly, the order this runs in is Thread 1, Thread 3, Thread 2
class Exercise_04 {
    public static void main(String[] args) {
        Greeting greet = new Greeting(); //seems like I'm creating a "dummy" object
        //just to pass in to the MyThread class ... confused on what's happening here
        //and why
        MyThread thread1 = new MyThread("Hello", greet);
        MyThread thread2 = new MyThread("Good bye", greet);
        MyThread thread3 = new MyThread("That's all folks!", greet);
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
        Greeting greet;

        public MyThread(String msg, Greeting greet) {
            this.msg = msg;
            this.greet = greet;
            thread = new Thread (this); // why doesn't this.thread work here?
            thread.start();
        }

        @Override
        public void run() {
            //This seems to be working ... not sure why
            synchronized (greet){
                greet.sayMessage(msg);
           }
        }
    }
}