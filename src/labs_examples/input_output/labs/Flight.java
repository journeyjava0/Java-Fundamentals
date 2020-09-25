package labs_examples.input_output.labs;

public class Flight {
    String airline;
    String departureTime;
    String departAirport;
    String arriveAirport;

    public Flight(){
    }

    public Flight(String airline, String departureTime, String departAirport, String arriveAirport) {
        this.airline = airline;
        this.departureTime = departureTime;
        this.departAirport = departAirport;
        this.arriveAirport = arriveAirport;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public void setDepartAirport(String departAirport) {
        this.departAirport = departAirport;
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline='" + airline + '\'' +
                ", departureTime=" + departureTime +
                ", departAirport='" + departAirport + '\'' +
                ", arriveAirport='" + arriveAirport + '\'' +
                '}';
    }
}
