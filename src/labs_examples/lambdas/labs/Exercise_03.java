package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Consumer;

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
        CarPOJO myCar = new CarPOJO("ford", "silver");
        //static method reference
        Consumer<Integer> whatSpeed = myCar::printSpeed;
        whatSpeed.accept(55);

        //instance method reference
        Consumer<CarPOJO> carStatus = myCar::stopCar;
        CarPOJO myCar2 = new CarPOJO("Kia", "red");
        carStatus.accept(myCar);

        //Constructor reference
        BiFunction<String, String, CarPOJO> myCar3 = CarPOJO::new;
        System.out.println(myCar3.apply("Ford", "blue"));
        System.out.println(myCar3.apply("GMC", "black"));
    }
}
