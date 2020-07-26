package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class TableSaw extends ToolsPower {
    String make;
    boolean hasStand;

    @Override
    public String getAmount(int num) {
        String tableSaw = "There are " + num + " " + make + " table saws";
        if(hasStand){
            String stand = " which includes a stand";
            return tableSaw + stand;
        } else return tableSaw;
    }

    public TableSaw(String make, boolean hasStand) {
        this.make = make;
        this.hasStand = hasStand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isHasStand() {
        return hasStand;
    }

    public void setHasStand(boolean hasStand) {
        this.hasStand = hasStand;
    }
}
