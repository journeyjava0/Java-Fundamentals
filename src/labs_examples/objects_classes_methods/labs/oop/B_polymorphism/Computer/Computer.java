package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Computer;

public class Computer {
   Monitor monitor;
   CPU cpu;
   HardDrive hd;

    public Computer(Monitor monitor, CPU cpu, HardDrive hd) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.hd = hd;
    }
}
