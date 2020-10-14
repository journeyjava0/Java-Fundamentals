package labs_examples.multi_threading.labs.Exercise_05;

public class TrafficLight {
    String color;
    TrafficLight trafficLight;

    public TrafficLight() {

    }

    public synchronized void status1 (String color){

        System.out.println(color);
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void status2 (String color){

        System.out.println(color);
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getColor() {
        return color;
    }

    public synchronized void setColor(String color) {
        this.color = color;
    }

}
