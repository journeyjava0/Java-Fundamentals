package labs_examples.multi_threading.labs.ThreadPractice.Set2;

public class MyRunnableMethods2 {
    public static synchronized void sayMessage(){
        System.out.println("Hello, I'm " + Thread.currentThread().getName());
        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }
    }
    public static synchronized String greeting(){
        String greeting = "Greetings from ";
        return greeting;
    }
}
