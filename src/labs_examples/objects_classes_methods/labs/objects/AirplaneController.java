package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {


    public static void main(String[] args) {

        //POJO
        Engines ua1Engines = new Engines(2, "Pratt & Whitney");
        Seats ua1Seats = new Seats(80, 2);
        Crew ua1Crew = new Crew(2, 6);
        Passengers ua1Passengers = new Passengers(60);
        //New object of POJO?
        Airplane ua1 = new Airplane(ua1Engines, ua1Seats, ua1Crew, ua1Passengers);

        //POJO
        Engines ua2Engines = new Engines(4, "Boeing");
        Seats ua2Seats = new Seats(120, 3);
        Crew ua2Crew = new Crew(4, 8);
        Passengers ua2Passengers = new Passengers(100);
        //New Object of POJO?
        Airplane ua2 = new Airplane(ua2Engines, ua2Seats, ua2Crew, ua2Passengers);

        System.out.println("Flight 1 has " + ua1.getPassengers().numPassengers + " flight 2 has " + ua2.getPassengers().getNumPassengers() + " passengers");
    }
}

