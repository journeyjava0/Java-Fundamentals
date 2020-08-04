package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Computer;

public class ComputerController {
    public static void main(String[] args) {
        DellMonitor monitor = new DellMonitor();
        Computer myComputer = new Computer(monitor, new IntelCPU(), new SonyHardDrive());

        Computer myOther = new Computer (new DellMonitor(), new TI_CPU(), new SonyHardDrive());

        System.out.println(myComputer.cpu.getClockSpeed());
        System.out.println(myOther.cpu.getClockSpeed());

        Computer c1 = new Computer (new AppleMonitor(), new IntelCPU(), new SamsungHardDrive());
        System.out.println(myComputer.monitor.getResolution());
        System.out.println(c1.monitor.getResolution());
        myOther.cpu.turnOnFan();
        c1.cpu.turnOnFan();

    }
}
