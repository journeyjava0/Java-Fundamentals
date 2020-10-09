package labs_examples.multi_threading.labs.Exercise_06;

public class MyRunnableEx6 implements Runnable {
    Thread thread;
    MethodsEx6 methodsEx6;

    public MyRunnableEx6(MethodsEx6 methodsEx6){
        this.methodsEx6 = methodsEx6;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++){
            if (i % 2 == 0) {
                methodsEx6.numsEven(i);
            } else methodsEx6.numsOdd(i);
        }
    }
}

