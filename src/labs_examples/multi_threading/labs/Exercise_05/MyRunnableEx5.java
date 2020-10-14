package labs_examples.multi_threading.labs.Exercise_05;

public class MyRunnableEx5 implements Runnable {
    Thread thread;
    TrafficLight trafficLight;
    String color;

    public MyRunnableEx5(TrafficLight trafficLight, String color) {
        this.color = color;
        this.trafficLight = trafficLight;
        thread = new Thread (this);
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            if(color.equals("green")){
                trafficLight.status1(color);
            } else
                trafficLight.status2(color);
        }
    }
}
