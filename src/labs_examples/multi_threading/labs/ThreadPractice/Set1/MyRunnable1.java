package labs_examples.multi_threading.labs.ThreadPractice.Set1;

public class MyRunnable1 implements Runnable {
    Thread thread;

    public MyRunnable1() {
        thread = new Thread (this);
        thread.start();
    }

    @Override
    public void run() {

        MyRunnableMethod1 slot1 = new MyRunnableMethod1();
        slot1.message();
        slot1.countNums();

    }
}
