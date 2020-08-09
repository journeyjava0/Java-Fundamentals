package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Computer;

public class TI_CPU extends CPU {
    @Override
    public int getClockSpeed() {
        return 5000;
    }

    @Override
    public void turnOnFan() {
        StringBuilder sb = new StringBuilder();
        sb.append("TI cpu \n");
        sb.append("screaming loudly...");
        sb.append("where's my fan?!");
        System.out.println(sb.toString());
    }

}
