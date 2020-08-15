package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public class CarDealerController {
    public static void main(String[] args) {
    LocalDealer denver = new LocalDealer("Denver Auto Dealer", "USA", "CO", "Denver");
    CarDealer1 den = new CarDealer1();
    //Question: How do I 'link' my methods in my CarDealer1 class (which implements the CarDealerIntFace)
        //to my object 'denver'? I'm not sure why I'm creating a class that implements the interface?
        //If I wanted a method just for the LocalDealer class, would it go in that class?
    den.salePrice(25000, 1500, 0.02);
    den.inventory();
    System.out.println(" ");

   // StateDealer colorado = new StateDealer ("Colorado State Dealer", "USA", "CO");
   // colorado.greeting(colorado.getDealerName());
    den.inventory(); //calling method from interface
    denver.greeting(denver.getDealerName()); //overriding greeting method in StateDealer class

        //Question: how to invoke method from abstract class?
        // TradeIn myCar = new TradeIn(); //causes an error

       //Question: Need to walk through this one step by step. I started in the LocalDealer class. I don't understand
        // what it means to use an interface as an instance variable.
//        3) Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
//        parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
//        understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
//        application.

        LocalDealer ld = new LocalDealer();
        PrivateDealer pd = new PrivateDealer();
        CarConvention carCon = new CarConvention(ld);
        carCon.info();
        CarConvention carCon2 = new CarConvention(pd);
        carCon2.info();
    }
}
