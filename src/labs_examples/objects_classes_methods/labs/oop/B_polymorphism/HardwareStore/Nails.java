package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class Nails extends Fasteners{
    String type;

    @Override
    public String getAmount(int num) {
        String totalNum = "Total number of " + type + " nails are: " + num;
        return totalNum;
    }

    public Nails(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
