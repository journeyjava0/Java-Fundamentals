package labs_examples.objects_classes_methods.labs.objects.car.Steve;

public class FastCar {

    private int speed;
    private String model;

    public FastCar(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public FastCar (){}

    @Override
    public String toString() {
        return "FastCar{" +
                "speed=" + speed +
                ", model=" + model +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0){
            this.speed = speed;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

