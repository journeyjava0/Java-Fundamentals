package labs_examples.multi_threading.labs.ThreadPractice.Set2;

public class Controller2 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyRunnable2 t1 = new MyRunnable2("Bill");
        MyRunnable2 t2 = new MyRunnable2("George");
        MyRunnable2 t3 = new MyRunnable2("Tom");
        System.out.println("Main thread complete");
       }
}
