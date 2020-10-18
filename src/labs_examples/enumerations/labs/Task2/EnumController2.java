package labs_examples.enumerations.labs.Task2;

// 2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
// *      of this enum from a seperate class.

public class EnumController2 {
    public static void main(String[] args) {
        CarEnum myCar = CarEnum.PORSCHE;
        carSpecs(myCar);

        CarEnum myFord = CarEnum.FORD;
        carSpecs(myFord);
    }

    public static void carSpecs(CarEnum car){
        System.out.println("Your " + car.toString() + " is " + car.getColor() + " goes " + car.getSpeed() + " mph!");
    }
}
