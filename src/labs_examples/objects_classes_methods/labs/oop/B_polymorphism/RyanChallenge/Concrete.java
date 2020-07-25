package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class Concrete implements Amount {

    String type;

    public Concrete(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getAmnt(int num) {
        System.out.println(num + " yards of concrete are needed");
    }

    @Override
    public void getCost(int cost) {
        System.out.println("The total cost is $" + cost);
    }


}
