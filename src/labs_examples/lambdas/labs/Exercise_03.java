package labs_examples.lambdas.labs;

import labs_examples.packages.labs.Vehicles.Car;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */
public class Exercise_03{
    public static void main(String[] args) {
        //static method reference
        Consumer<Integer> whatSpeed = CarPOJO::setSpeed;
        CarPOJO.setSpeed(50);

        //instance method reference
        Consumer<CarPOJO> carStatus = CarPOJO::stopCar;
        CarPOJO myCar2 = new CarPOJO("Kia", "red");
        carStatus.accept(myCar2);

        //Constructor reference
        BiFunction<String, String, CarPOJO> myCar = CarPOJO::new;
        System.out.println(myCar.apply("Ford", "blue"));
        System.out.println(myCar.apply("GMC", "black"));
        }
}
