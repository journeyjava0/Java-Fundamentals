package labs_examples.packages.labs.Controller;

//Have to import the Car class since it's in a different package than the Vehicle controller
import labs_examples.packages.labs.Vehicles.Car;

public class VehicleController {

    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "Corolla", 1998);

        //calling public method in a different package
        corolla.slowDown();

        //trying to call protected method in a different package which won't work
        corolla.speedUp();

    }
}

