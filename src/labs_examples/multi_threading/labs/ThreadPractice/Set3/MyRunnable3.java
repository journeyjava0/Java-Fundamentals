package labs_examples.multi_threading.labs.ThreadPractice.Set3;

public class MyRunnable3 implements Runnable {
    Thread thread;

    public MyRunnable3() {
       thread = new Thread (this);
       thread.start();
    }

    @Override
    public void run() {
        System.out.println("Hello, I'm " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++){
            System.out.println("Iteration " + i + " of " + Thread.currentThread().getName());
        }
    }
}
