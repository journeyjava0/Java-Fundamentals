package labs_examples.objects_classes_methods.labs.objects.car.Steve;

public class MyCar {
    String type;
    int year;
    String make;
    String color;
    boolean forSale;
    DriveTrain transmission;
    FastCar fast;
    ElectricCar electric;

    public MyCar(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public MyCar(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public MyCar(boolean forSale, DriveTrain transmission) {
        this.forSale = forSale;
        this.transmission = transmission;
        System.out.println(4);
        System.out.println(4.4);
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        Object o = new Object();
        return "MyCar{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", forSale=" + forSale +
                ", transmission=" + transmission +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public DriveTrain getTransmission() {
        return transmission;
    }

    public void setTransmission(DriveTrain transmission) {
        this.transmission = transmission;
    }


    class forSale {
        boolean forSale;

        public forSale(boolean forSale) {
            this.forSale = forSale;
        }

        @Override
        public String toString() {
            return "forSale{" +
                    "forSale=" + forSale +
                    '}';
        }

        public boolean isForSale() {
            return forSale;
        }

        public void setForSale(boolean forSale) {
            this.forSale = forSale;
        }
    }
} //why does this end } go here and not at the end of the file? If I put the
// } at the end of the file, the classes aren't recognized ... is that because you can't have a class within a class?







