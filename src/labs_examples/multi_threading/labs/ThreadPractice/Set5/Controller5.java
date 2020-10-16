package labs_examples.multi_threading.labs.ThreadPractice.Set5;

public class Controller5 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyRunnable5 r1 = new MyRunnable5("Thread 1");
        MyRunnable5 r2 = new MyRunnable5("Thread 2");
        System.out.println("Main thread complete");
    }
}
