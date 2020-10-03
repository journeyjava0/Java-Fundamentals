package labs_examples.multi_threading.labs;

public class SteveRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum =0;
        for(int i = 0; i < 1000; i++){
            sum +=i;
        }
        System.out.println(sum + Thread.currentThread().getName());
    }
}

