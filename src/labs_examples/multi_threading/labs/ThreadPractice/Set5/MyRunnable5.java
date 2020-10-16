package labs_examples.multi_threading.labs.ThreadPractice.Set5;

public class MyRunnable5 extends Thread {
    Thread thread;

    public MyRunnable5(String name){
        super(name);
        thread = new Thread (this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running now");
    }
}
