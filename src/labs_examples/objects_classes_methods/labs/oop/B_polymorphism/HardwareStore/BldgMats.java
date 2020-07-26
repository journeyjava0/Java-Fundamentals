package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class BldgMats implements Amount {

    @Override
    public String getAmount(int num) {
        String totalNum = "Total number of building materials is: " + num;
        return totalNum;
    }
}
