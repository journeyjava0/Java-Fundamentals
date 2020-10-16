package labs_examples.multi_threading.labs.ThreadPractice.Set6;

public class MyRunnable6 extends Thread {
    Thread thread;

    public MyRunnable6(String name){
        super(name);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
