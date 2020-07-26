package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class Fasteners implements Amount{

    @Override
    public String getAmount(int num) {
        String totalNum = "Total number of fasteners is: " + num;
        return totalNum;
    }
}
