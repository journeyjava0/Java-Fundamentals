package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class Drywall extends BldgMats {
    String type; //I.e. sheetrock, drywall, backer-board etc.

    @Override
    public String getAmount(int num) {
        String totalNum = "Total number of sheets of " + type + " is " + num;
        return totalNum;
    }

    public Drywall(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
