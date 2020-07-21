package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class VehicleController {

    public static void main(String[] args) {
        Car myCar = new Car(true, false, false, 4, 5, "Toyota", "Corolla");
        myCar.startVehicle(); //override method in TransportationMode class

        Car someCar = new Car ();
        someCar.setMake("Ford");
        someCar.setModel("Fiesta");
        System.out.println(someCar.getMake() + " " + someCar.getModel());

    }
}