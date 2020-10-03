package labs_examples.multi_threading.labs.Exercise_04.SyncBlockDemo;

public class MyRunnable implements Runnable {
    Thread thread;
    MessagePOJO messagePOJO;

    public MyRunnable(MessagePOJO messagePOJO) {
        this.messagePOJO = messagePOJO;
        thread = new Thread (this);
        thread.start();

    }

    @Override
    public void run() {
       synchronized (messagePOJO){
           for (int i = 0; i < 3; i++){
               System.out.println("Iteration " + i + " of " + Thread.currentThread().getName());
               System.out.println(messagePOJO.getMessage() + ", " + messagePOJO.getName());
           }
       }
    }
}
//Expected output
//Iteration 0 of Thread 0
//Hello Bob
//Iteration 1 of Thread 0
//Hello Bob
//Iteration 2 of Thread 0
//Hello Bob
//Iteration 0 of Thread 1
//Good morning, George
//Iteration 1 of Thread 1
//Good morning, George
//Iteration 2 of Thread 1
//Good morning, George