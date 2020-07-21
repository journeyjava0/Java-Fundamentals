package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class VehicleController {

    public static void main(String[] args) {
        Car myCar = new Car(true, false, false, 4, 5, "Toyota", "Corolla");
        myCar.startVehicle(); //override method in TransportationMode class

        Car someCar = new Car ();
        someCar.setMake("Ford");
        someCar.setModel("Fiesta");
        System.out.println(someCar.getMake() + " " + someCar.getModel());

        TransportationMode test = new TransportationMode();
        test.startVehicle(); //calls method in Transportation Mode Class

        //line 7 and 15 appear to be calls to the same method, however line 7 is overriding
        //the method in line 15 which is polymorphism and line 15 is a call to the 'original' method.


    }
}