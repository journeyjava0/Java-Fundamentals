package labs_examples.packages.labs.Vehicles;

public class Car {
    String make;
    String model;
    int year;

    public Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car () {

    }

    protected void speedUp (){
        System.out.println(make + " is speeding up");
    }

    public void slowDown() {
        System.out.println(make + " is slowing down");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
