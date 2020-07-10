package labs_examples.objects_classes_methods.labs.objects.car.Steve;

public class DriveTrain {

    String type;
    String option;

    public DriveTrain(String type, String option) {
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
        return "DriveTrain{" +
                "type='" + type + '\'' +
                ", option='" + option + '\'' +
                '}';
    }

}
