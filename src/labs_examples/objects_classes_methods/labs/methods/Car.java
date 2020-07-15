package labs_examples.objects_classes_methods.labs.methods;

public class Car {
    //to demonstrate pass by reference
    int speed;
    String color;
    String make;

    public Car(int speed, String color, String make) {
        this.speed = speed;
        this.color = color;
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
