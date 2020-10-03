package labs_examples.multi_threading.labs.ThreadPractice.Set4;

public class MyRunnable4 extends Thread {
    Thread thread;

    public MyRunnable4(String name) {
        super(name);
        thread = new Thread (this);
        thread.start();
    }

 @Override
    public void run(){
     System.out.println("This is " + Thread.currentThread().getName());
    Set4Methods.counting();
 }
}
