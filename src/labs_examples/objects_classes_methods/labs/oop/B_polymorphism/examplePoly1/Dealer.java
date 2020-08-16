package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public abstract class Dealer implements CarDealerIntFace{
    String dealerName;
    String country;

    public Dealer () {

    }

    public Dealer(String dealerName, String country) {
        this.dealerName = dealerName;
        this.country = country;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerName='" + dealerName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public void tradeIn(int tradeValue, int markdown) {
        System.out.println("Dealer trade in");
    }
}
