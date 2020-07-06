package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    double fuelCapacity;
    double currentFuelLevel;

    //Note that JetEngine, Crew, Seat, Passenger are POJOs (separate files with same name that are used to create the
    //Airplane object in the main method (AirplaneController.java).
    JetEngine engines;
    Crew crews;
    Seat seats;
    Passenger passengers;

    public Airplane(JetEngine engines, Crew crews, Seat seats, Passenger passengers) {
        this.engines = engines;
        this.crews = crews;
        this.seats = seats;
        this.passengers = passengers;
    }

    public JetEngine getEngines() {
        return engines;
    }

    public void setEngines(JetEngine engines) {
        this.engines = engines;
    }

    public Crew getCrews() {
        return crews;
    }

    public void setCrews(Crew crews) {
        this.crews = crews;
    }

    public Seat getSeats() {
        return seats;
    }

    public void setSeats(Seat seats) {
        this.seats = seats;
    }

    public Passenger getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engines=" + engines +
                ", crews=" + crews +
                ", seats=" + seats +
                ", passengers=" + passengers +
                '}';
    }
}

