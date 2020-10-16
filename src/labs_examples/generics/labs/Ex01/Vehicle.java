package labs_examples.generics.labs.Ex01;

public class Vehicle <M, Y> {
    M make;
    Y year;

    public Vehicle(M make, Y year) {
        this.make = make;
        this.year = year;
    }

    public M getMake() {
        return make;
    }

    public void setMake(M make) {
        this.make = make;
    }

    public Y getYear() {
        return year;
    }

    public void setYear(Y year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make=" + make +
                ", year=" + year +
                '}';
    }
}
