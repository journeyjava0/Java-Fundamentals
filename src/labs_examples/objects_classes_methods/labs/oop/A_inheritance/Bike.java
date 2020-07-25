package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bike extends LandTransport {

    public Bike() {
    }

    public Bike(boolean gasEngine, boolean electricEngine, boolean noEngine, int numWheels, int numPax) {
        super(gasEngine, electricEngine, noEngine, numWheels, numPax);
    }

    @Override
    public void startVehicle() {
        System.out.println("Just use the pedals");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numWheels=" + numWheels +
                ", numPax=" + numPax +
                ", gasEngine=" + gasEngine +
                ", electricEngine=" + electricEngine +
                ", noEngine=" + noEngine +
                '}';
    }
}
