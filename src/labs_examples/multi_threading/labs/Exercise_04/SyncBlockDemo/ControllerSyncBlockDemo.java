package labs_examples.multi_threading.labs.Exercise_04.SyncBlockDemo;

//Demonstrate the use of a synchronized block

public class ControllerSyncBlockDemo {
    public static void main(String[] args) {
    MessagePOJO msg1 = new MessagePOJO("Bob", "Hello");
    MessagePOJO msg2 = new MessagePOJO("George", "Good morning");
    MyRunnable r1 = new MyRunnable(msg1);
    MyRunnable r2 = new MyRunnable(msg2);
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