package labs_examples.multi_threading.labs.Exercise_04;

//A class for a Greeting with a method that displays a simple message
public class Greeting {
    public synchronized void sayMessage (String msg){
        System.out.println("The message is " + msg);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Message was displayed was " + msg);
    }
}
