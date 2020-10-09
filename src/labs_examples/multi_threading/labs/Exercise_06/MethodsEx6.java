package labs_examples.multi_threading.labs.Exercise_06;

public class MethodsEx6 {

    public MethodsEx6() {
    }

    public synchronized void numsEven (int num) {
        System.out.println(num);
        System.out.println(Thread.currentThread().getName());

        notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }


    public synchronized void numsOdd(int num) {
        System.out.println(num);
        System.out.println(Thread.currentThread().getName());

        notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}





