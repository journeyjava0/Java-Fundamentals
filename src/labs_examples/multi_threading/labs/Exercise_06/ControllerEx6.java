package labs_examples.multi_threading.labs.Exercise_06;
//Supposed to print 1 to 100 sequentially from 2 different threads
//but it doesn't work, both threads are printing all numbers
//it's supposed to be one thread prints evens and one prints odds
public class ControllerEx6 {
    public static void main(String[] args) {
        MethodsEx6 m1 = new MethodsEx6();
        MyRunnableEx6 t1 = new MyRunnableEx6(m1);
        MyRunnableEx6 t2 = new MyRunnableEx6(m1);
    }
}
