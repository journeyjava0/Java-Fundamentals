package labs_examples.objects_classes_methods.labs.objects;

public class MyCar {
    String type;
    int year;
    String make;
    String color;
    boolean forSale;
    driveTrain transmission;
    fastCar fast;
    electricCar electric;

    public MyCar(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public MyCar(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public MyCar(boolean forSale, driveTrain transmission) {
        this.forSale = forSale;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
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

    public driveTrain getTransmission() {
        return transmission;
    }

    public void setTransmission(driveTrain transmission) {
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
    class driveTrain {
        String type;
        String option;

        public driveTrain(String type, String option) {
            this.type = type;
            this.option = option;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOption() {
            return option;
        }

        public void setOption(String option) {
            this.option = option;
        }

        @Override
        public String toString() {
            return "driveTrain{" +
                    "type='" + type + '\'' +
                    ", option='" + option + '\'' +
                    '}';
        }
    }
class fastCar {
    int speed;
    String model;

    public fastCar(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "fastCar{" +
                "speed=" + speed +
                ", model=" + model +
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
}

class electricCar {
    int speed;
    String model;
    int year;

    public electricCar(int speed, String model, int year) {
        this.speed = speed;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "electricCar{" +
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


