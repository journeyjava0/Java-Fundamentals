package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Exercise_02 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        MyFirstThread thread1 = new MyFirstThread("Thread 1");
        MyFirstThread thread2 = new MyFirstThread("Thread 2");
        thread2.setPriority(9);
        thread1.setPriority(1);
        System.out.println("Main Thread Complete");
    }

}

class MyFirstThread extends Thread {
    MyFirstThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println(getName() + " is starting");
        try {
            for (int count = 0; count < 5; count++){
                Thread.sleep(400);
                System.out.println(getName() + " is on iteration " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(getName() + " was interrupted");
        }
        System.out.println(getName() + " is now terminated");
    }
}

