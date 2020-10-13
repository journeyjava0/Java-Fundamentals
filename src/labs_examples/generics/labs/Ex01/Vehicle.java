package labs_examples.generics.labs.Ex01;

public class Vehicle <T> {
    T make;
    T year;

    public Vehicle(T make, T year) {
        this.make = make;
        this.year = year;
    }

    public T getMake() {
        return make;
    }

    public void setMake(T make) {
        this.make = make;
    }

    public T getYear() {
        return year;
    }

    public void setYear(T year) {
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
