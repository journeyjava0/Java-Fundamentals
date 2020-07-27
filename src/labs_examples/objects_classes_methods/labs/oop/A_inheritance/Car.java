package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Car extends LandTransport {
    protected String make;
    protected String model;

    public Car () {

    }

    public Car(boolean gasEngine, boolean electricEngine, boolean noEngine, int numWheels, int numPax, String make, String model) {
        super(gasEngine, electricEngine, noEngine, numWheels, numPax);
        this.make = make;
        this.model = model;
    }

    @Override
    public void startVehicle () {
        System.out.println("Step 1: Ensure key fob in car and push button");
    }

    @Override
    public void mpg (int mpg) {
        System.out.println(mpg + " mpg");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numWheels=" + numWheels +
                ", numPax=" + numPax +
                ", gasEngine=" + gasEngine +
                ", electricEngine=" + electricEngine +
                ", noEngine=" + noEngine +
                '}';
    }
}
