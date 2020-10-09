package labs_examples.multi_threading.labs.Exercise_04;

public class SteveRunnableDemo {
    public static void main(String[] args) {
        SteveRunnable s1 = new SteveRunnable();
        SteveRunnable s2 = new SteveRunnable();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
        System.out.println("threads started (main)");
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("all threads complete (main)");
        MyThread t3 = new MyThread("new greeting", new Greeting());
    }
}
