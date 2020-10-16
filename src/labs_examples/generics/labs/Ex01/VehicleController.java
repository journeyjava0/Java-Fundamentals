package labs_examples.generics.labs.Ex01;

import java.util.HashMap;

public class VehicleController {
    public static void main(String[] args) {
        //car 1 is color then year
        Vehicle<String, Integer> car1 = new Vehicle("Blue", 2004);
        System.out.println(car1);

        //motorbike is price then make
        Vehicle<String, String> motorbike = new Vehicle("400", "Kawasaki");
        System.out.println(motorbike.toString());

        //airplane is number of pax and price per ticket
        Vehicle<Integer, Double> airplane = new Vehicle(80, 394.26);
        System.out.println(airplane);

        Vehicle<String, Integer> car2 = new Vehicle("Blue", 2004);
        Node<Vehicle> n = new Node();
        n.data = car1;
        Node<Vehicle> n2 = new Node();
        n2.data = car2;
        n.next = n2;

        HashMap<String, Integer> statePops = new HashMap<>();
        statePops.put("Colorado", 5750000);
        statePops.put("California", 39500000);
        int caPop = statePops.get("California");
    }

}

class Node<T> {
    T data;
    Node next;
}