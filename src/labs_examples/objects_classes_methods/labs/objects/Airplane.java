package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    double fuelCapacity;
    double currentFuelLevel;
    Engines engines;
    Seats seats;
    Crew crew;
    Passengers passengers;

    public Airplane(Engines engines, Seats seats, Crew crew, Passengers passengers) {
        this.engines = engines;
        this.seats = seats;
        this.crew = crew;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                "\n, engines=" + engines +
                "\n, seats=" + seats +
                "\n, crew=" + crew +
                "\n, passengers=" + passengers +
                '}';
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }
}



class Engines {
    int numEngines;
    String engineMake;

    public Engines(int numEngines, String engineMake) {
        this.numEngines = numEngines;
        this.engineMake = engineMake;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "numEngines=" + numEngines +
                ", engineMake='" + engineMake + '\'' +
                '}';
    }

    public int getNumEngines() {
        return numEngines;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public String getEngineMake() {
        return engineMake;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }
}

class Seats {
    int numSeats;
    int numAisles;

    public Seats(int numSeats, int numAisles) {
        this.numSeats = numSeats;
        this.numAisles = numAisles;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "numSeats=" + numSeats +
                ", numAisles=" + numAisles +
                '}';
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumAisles() {
        return numAisles;
    }

    public void setNumAisles(int numAisles) {
        this.numAisles = numAisles;
    }
}

class Crew {
    int numPilots;
    int numFlightAttendants;

    public Crew(int numPilots, int numFlightAttendants) {
        this.numPilots = numPilots;
        this.numFlightAttendants = numFlightAttendants;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "numPilots=" + numPilots +
                ", numFlightAttendants=" + numFlightAttendants +
                '}';
    }

    public int getNumPilots() {
        return numPilots;
    }

    public void setNumPilots(int numPilots) {
        this.numPilots = numPilots;
    }

    public int getNumFlightAttendants() {
        return numFlightAttendants;
    }

    public void setNumFlightAttendants(int numFlightAttendants) {
        this.numFlightAttendants = numFlightAttendants;
    }
}

class Passengers {
    int numPassengers;

    public Passengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "numPassengers=" + numPassengers +
                '}';
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}