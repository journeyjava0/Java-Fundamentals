package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class SportsCar extends Car {
    protected int speed;

    public SportsCar() {
    }

    public SportsCar(boolean gasEngine, boolean electricEngine, boolean noEngine, int numWheels, int numPax, String make, String model, int speed) {
        super(gasEngine, electricEngine, noEngine, numWheels, numPax, make, model);
        this.speed = speed;
    }

    @Override
    public void startVehicle() {
        System.out.println("Use key fob, foot on break, push 'start' button");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numWheels=" + numWheels +
                ", numPax=" + numPax +
                ", gasEngine=" + gasEngine +
                ", electricEngine=" + electricEngine +
                ", noEngine=" + noEngine +
                '}';
    }
}
