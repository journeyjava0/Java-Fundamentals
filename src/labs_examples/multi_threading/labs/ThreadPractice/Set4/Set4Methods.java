package labs_examples.multi_threading.labs.ThreadPractice.Set4;

public class Set4Methods {

    public static synchronized void counting(){
        for (int i = 0; i < 3; i++){
            System.out.println("This is iteration " + i + " of " + Thread.currentThread().getName());
        }
    }
}
