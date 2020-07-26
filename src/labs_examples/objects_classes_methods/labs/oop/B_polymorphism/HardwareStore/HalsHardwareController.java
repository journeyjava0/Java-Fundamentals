package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.HardwareStore;

public class HalsHardwareController {
    public static void main(String[] args) {

        //Local store
        HalsHardware halsStore = new HalsHardware(new Nails("Ardox"), new Drywall("Sheetrock"),
               new Drill("Dewalt", true) );
        System.out.println("HalsHardware has the following inventory: ");
        System.out.println(halsStore.fasteners.getAmount(400));
        System.out.println(halsStore.bldgMats.getAmount(5));
        System.out.println(halsStore.tools.getAmount(50));

        System.out.println(" ");

        //Dallas Store
        HalsHardware dallas = new HalsHardware(new Screws("deck"), new ConventionalLumber("plywood",
                true), new TableSaw("Ryobi", true));
        System.out.println("HalsHardware in Dallas has the following inventory: ");
        System.out.println(dallas.fasteners.getAmount(1500));
        System.out.println(dallas.bldgMats.getAmount(500));
        System.out.println(dallas.tools.getAmount(6));

        System.out.println(" ");

        //Houston Store
        HalsHardware houston = new HalsHardware(new Screws("wood"), new Drywall("backer board"),
                new Drill ("Makita", true));
        System.out.println("HalsHardware in Houston has the following inventory: ");
        System.out.println(houston.fasteners.getAmount(200));
        System.out.println(houston.bldgMats.getAmount(700));
        System.out.println(houston.tools.getAmount(10));
    }
}
