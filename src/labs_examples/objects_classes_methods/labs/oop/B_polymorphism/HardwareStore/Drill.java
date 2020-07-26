package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class Drill extends ToolsPower {
    String make;
    boolean cordless;

    public String getAmount (int num) {
        String drill = "There are " + num + " " + make + " drills";
        if(cordless) {
            String noCord = " that are cordless";
            return drill + noCord;
        } else return drill;
    }

    public Drill(String make, boolean cordless) {
        this.make = make;
        this.cordless = cordless;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isCordless() {
        return cordless;
    }

    public void setCordless(boolean cordless) {
        this.cordless = cordless;
    }
}
