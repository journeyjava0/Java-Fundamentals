package labs_examples.multi_threading.labs.Exercise_05;

public class Controller_Ex5 {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight();
        MyRunnableEx5 thread1 = new MyRunnableEx5(trafficLight1, "green");
        MyRunnableEx5 thread2 = new MyRunnableEx5(trafficLight1, "red");
    }
}
