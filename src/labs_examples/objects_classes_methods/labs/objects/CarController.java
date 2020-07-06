package labs_examples.objects_classes_methods.labs.objects;

public class CarController {
    public static void main(String[] args) {


        MyCar toyota = new MyCar ("Truck", 2008);

        MyCar ford = new MyCar ("Ford", "red");

        driveTrain theHonda = new driveTrain ("automatic", "AWD");
        MyCar honda = new MyCar(true, theHonda);

        fastCar lambo = new fastCar (500, "lambo");

        electricCar tesla = new electricCar(250, "Tesla", 2019);

        System.out.println("The first vehicle is a " + toyota.getYear() + " " + toyota.getType());
        System.out.println("The second vehicle is a " + ford.getColor() + " " + ford.getMake());
        System.out.println("The third vehicle is an " + honda.getTransmission().type + " with " + honda.getTransmission().option);
        System.out.println("The fourth car is a " + lambo.getModel());
        System.out.println("The final car is a " + tesla.getYear() + " " + tesla.getModel() + " with a top speed of " + tesla.getSpeed() + "mph");
    }
}
