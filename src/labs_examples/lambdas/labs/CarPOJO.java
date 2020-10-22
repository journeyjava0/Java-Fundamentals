package labs_examples.lambdas.labs;

import java.util.function.Consumer;

public class CarPOJO<S> {
    String make;
    String color;


    public CarPOJO(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public void printSpeed(int speed){
        System.out.println(speed);
    }

    public void setSpeed (int speed){
        System.out.println("Car is going " + speed + " mph.");
    }

    public void stopCar (CarPOJO car) {
        System.out.println("Car is now stopped.");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarPOJO{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
