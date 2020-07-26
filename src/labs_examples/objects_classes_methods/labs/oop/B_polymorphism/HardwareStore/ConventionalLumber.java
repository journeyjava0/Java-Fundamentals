package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class ConventionalLumber extends BldgMats {
    String type;
    boolean pressureTreated;

    @Override
    public String getAmount(int num) {
        String totalNum = "Total amount of lumber is: " + num + "sq ft ";
        if (pressureTreated){
            String pt = "and is pressure treated";
            return totalNum + pt;
        } else return totalNum;
    }

    public ConventionalLumber(String type, boolean pressureTreated) {
        this.type = type;
        this.pressureTreated = pressureTreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPressureTreated() {
        return pressureTreated;
    }

    public void setPressureTreated(boolean pressureTreated) {
        this.pressureTreated = pressureTreated;
    }
}
