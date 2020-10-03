package labs_examples.multi_threading.labs.ThreadPractice.Set2;

public class MyRunnable2 implements Runnable {
    Thread thread;
    String name;

    public MyRunnable2(String name) {
        this.name = name;
        thread = new Thread (this);
        thread.start();
        }

    //It's interesting, that because I used 'sychronized' in the method signature, all 3 threads do the first method
    //then once all 3 are done with the first, then they go back and do the third
    @Override
    public void run() {
        System.out.println("Hello " + name);
        MyRunnableMethods2.sayMessage();
        System.out.println(MyRunnableMethods2.greeting() + Thread.currentThread().getName());
    }
}
