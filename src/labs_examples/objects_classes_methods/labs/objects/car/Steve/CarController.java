package labs_examples.objects_classes_methods.labs.objects.car.Steve;

import labs_examples.objects_classes_methods.labs.objects.JetEngine;

public class CarController {
    public static void main(String[] args) {


        MyCar toyota = new MyCar ("Truck", 2008);

        MyCar ford = new MyCar ("Ford", "red");

        DriveTrain theHonda = new DriveTrain("automatic", "AWD");
        MyCar honda = new MyCar(true, theHonda);

        FastCar lambo = new FastCar(500, "lambo");

        ElectricCar tesla = new ElectricCar(250, "Tesla", 2019);

        System.out.println("The first vehicle is a " + toyota.getYear() + " " + toyota.getType());
        System.out.println("The second vehicle is a " + ford.getColor() + " " + ford.getMake());
        System.out.println("The third vehicle is an " + honda.getTransmission().type + " with " + honda.getTransmission().option);
        //System.out.println("The fourth car is a " + lambo.getModel());
        System.out.println("The final car is a " + tesla.getYear() + " " + tesla.getModel() + " with a top speed of " + tesla.getSpeed() + "mph");

        //just for fun, I'm going to create a jetEngine using the JetEngine POJO
        JetEngine forFun = new JetEngine(4, "Lockheed Martin");
        System.out.println("We also have a " + forFun.getEngineMake() + " jet engine, with " + forFun.getNumEngines() + " turbines");

        FastCar lambo1 = new FastCar();
        lambo1.setSpeed(100);
        lambo1.setModel("A");
    }
}
