package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class HalsHardware {
    Fasteners fasteners;
    BldgMats bldgMats;
    ToolsPower tools;

    public HalsHardware(Fasteners fasteners, BldgMats bldgMats, ToolsPower tools) {
        this.fasteners = fasteners;
        this.bldgMats = bldgMats;
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "HalsHardware{" +
                "fasteners=" + fasteners +
                ", bldgMats=" + bldgMats +
                ", tools=" + tools +
                '}';
    }
}
