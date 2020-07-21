package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class TransportationMode {
    protected boolean gasEngine;
    protected boolean electricEngine;
    protected boolean noEngine;

    public TransportationMode () {

    }

    public void startVehicle () {
        System.out.println("Step 1: place key in ignition");
    }

    public TransportationMode(boolean gasEngine, boolean electricEngine, boolean noEngine) {
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
        this.noEngine = noEngine;
    }

    public boolean isGasEngine() {
        return gasEngine;
    }

    public void setGasEngine(boolean gasEngine) {
        this.gasEngine = gasEngine;
    }

    public boolean isElectricEngine() {
        return electricEngine;
    }

    public void setElectricEngine(boolean electricEngine) {
        this.electricEngine = electricEngine;
    }

    public boolean isNoEngine() {
        return noEngine;
    }

    public void setNoEngine(boolean noEngine) {
        this.noEngine = noEngine;
    }


}
