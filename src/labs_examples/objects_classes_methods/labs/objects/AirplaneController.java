package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {

    public static void main(String[] args) {

        //Create an object from the Airplane POJO
        //Step 1: Assign values to the object variables
        JetEngine ua1Engines = new JetEngine(2, "Pratt & Whitney");
        Crew ua1Crew = new Crew(2, 6);
        Seat ua1Seats = new Seat(80, 2);
        Passenger ua1Passengers = new Passenger(70);
        //Step 2: Create new object from the POJO
        Airplane ua1 = new Airplane(ua1Engines, ua1Crew, ua1Seats, ua1Passengers);

        //Create an object from the Airplane POJO
        //Step 1: Assign values to the object variables
        JetEngine ua2Engines = new JetEngine(4, "Boeing");
        Crew ua2Crew = new Crew(4, 8);
        Seat ua2Seats = new Seat(120, 3);
        Passenger ua2Passengers = new Passenger(100);
        //Step 2: Create new object from the POJO
        Airplane ua2 = new Airplane(ua2Engines, ua2Crew, ua2Seats, ua2Passengers);

        //Print out some values from the objects

        System.out.println("Flight 1 has " + ua1.getPassengers().numPassengers + " passengers " + "and flight 2 has " + ua2.getPassengers().getNumPassengers() + " passengers");

    //This is the example from the methods labs
        Crew newCrew1 = new Crew (5, 10); //instance variable (i.e. object) is set to private in the Airplane class
        ua2.setCrews(newCrew1); //line 30 creates a new object 'newCrew1' and line 31 uses the setter method to change the value of the
                                //arguments of the object 'newCrew1'
        System.out.println("new crew is " + ua2.getCrews());
        System.out.println(newCrew1);//I get the same result whether .toString is used or not on newCrew1 ... is that
                                                //because the .toString method is already applied to the 'Crew' object so
                                                //any instance of the Crew class when called will automatically be returned
                                                //becuase anytime the 'Crew' object is called it returns a String? (line 14 of crew class).
    }
}

