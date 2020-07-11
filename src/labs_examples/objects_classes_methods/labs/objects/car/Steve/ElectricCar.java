package labs_examples.objects_classes_methods.labs.objects.car.Steve;

public class ElectricCar {

    int speed;
    String model;
    int year;

    public ElectricCar(int speed, String model, int year) {
        this.speed = speed;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
}
