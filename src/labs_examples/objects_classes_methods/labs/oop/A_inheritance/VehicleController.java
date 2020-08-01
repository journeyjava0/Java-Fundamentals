package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class VehicleController {

    public static void main(String[] args) {
        Car myCar = new Car(true, false, false, 4, 5, "Toyota", "Corolla");
        myCar.startVehicle(); //override method in TransportationMode class
        myCar.mpg(25); //override method in TransportationMode class

        Car someCar = new Car ();
        someCar.setMake("Ford");
        someCar.setModel("Fiesta");
        System.out.println(someCar.getMake() + " " + someCar.getModel());

        TransportationMode test = new TransportationMode();
        test.startVehicle(); //calls method in Transportation Mode Class

        Bike bicycle = new Bike(false, false, true, 2, 1);
        bicycle.startVehicle();

        //line 7 and 16 and 19 appear to be calls to the same method, however line 7 is overriding
        //the method in line 16 which is polymorphism and line 16is a call to the 'original' method.
        //line 19 is overriding the methods in the TransportationMode class

        SportsCar lambo = new SportsCar();
        lambo.setSpeed(500);
        lambo.setMake("Lamborghini");
        lambo.startVehicle();
        System.out.println("Lambo speed is " + lambo.getSpeed() + " model is " + lambo.getMake());
    }
}