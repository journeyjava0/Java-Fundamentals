package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class ToolsPower implements Amount {

    @Override
    public String getAmount(int num) {
        String totalNum = "Total number of tools is: " + num;
        return totalNum;
    }
}

