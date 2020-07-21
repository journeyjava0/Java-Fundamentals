package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class LandTransport extends TransportationMode {
    protected int numWheels;
    protected int numPax;

    public LandTransport () {

    }

    public LandTransport(boolean gasEngine, boolean electricEngine, boolean noEngine, int numWheels, int numPax) {
        super(gasEngine, electricEngine, noEngine);
        this.numWheels = numWheels;
        this.numPax = numPax;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumPax() {
        return numPax;
    }

    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }
}
