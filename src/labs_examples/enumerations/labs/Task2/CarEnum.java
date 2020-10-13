package labs_examples.enumerations.labs.Task2;

public enum CarEnum {
    TOYOTA(200, "blue"),
    FORD(225, "green"),
    PORSCHE(300, "red");

    int speed;
    String color;

    CarEnum(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
