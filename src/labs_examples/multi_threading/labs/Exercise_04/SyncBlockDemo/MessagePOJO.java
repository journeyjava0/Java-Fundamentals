package labs_examples.multi_threading.labs.Exercise_04.SyncBlockDemo;

//setter & toString not required in this example

public class MessagePOJO {
    String name;
    String message;

    public MessagePOJO(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public synchronized String status(){
        for (int i = 0; i < 3; i++){
            System.out.println("Iteration " + i + " of " + Thread.currentThread().getName());
            System.out.println(message + ", " + name);
        }
        return Thread.currentThread().getName() + " done";
    }
}
