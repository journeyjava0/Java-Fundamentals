package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Computer;

public class IntelCPU extends CPU {
    @Override
    public int getClockSpeed() {
        return 25000;
    }

    @Override
    public void turnOnFan() {
        StringBuilder sb = new StringBuilder();
        sb.append("intel cpu \n");
        sb.append("overheating...");
        sb.append("power on super duper fan");
        sb.append("price: ").append(price);
        System.out.println(sb.toString());
    }
}
