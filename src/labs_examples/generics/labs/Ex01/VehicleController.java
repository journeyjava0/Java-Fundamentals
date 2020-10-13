package labs_examples.generics.labs.Ex01;

public class VehicleController {
    public static void main(String[] args) {
        //car 1 is color then year
        Vehicle car1 = new Vehicle("Blue", 2004);
        System.out.println(car1);
        //motorbike is price then make
        Vehicle motorbike = new Vehicle("400", "Kawasaki");
        System.out.println(motorbike.toString());

        //airplane is number of pax and price per ticket
        Vehicle airplane = new Vehicle(80, 394.26);
        System.out.println(airplane);
    }
}
