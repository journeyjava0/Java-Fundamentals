package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public abstract class StateDealer extends Dealer {
    String state;

    public StateDealer () {

    }

    public StateDealer(String dealerName, String country, String state) {
        super(dealerName, country);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void greeting (String dealerName) {
        System.out.println("You are currently browsing the " + dealerName);
    }

    @Override
    public String toString() {
        return "StateDealer{" +
                "state='" + state + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
