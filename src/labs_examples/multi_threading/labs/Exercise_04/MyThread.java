package labs_examples.multi_threading.labs.Exercise_04;


public class MyThread implements Runnable{
    Thread thread;
    String msg;
    Greeting greet;


    public MyThread(String msg, Greeting greet) {
        this.msg = msg;
        this.greet = greet;
        thread = new Thread (this);
        thread.start();
    }

    @Override
    public void run() {
        greet.sayMessage(msg);
    }

}
