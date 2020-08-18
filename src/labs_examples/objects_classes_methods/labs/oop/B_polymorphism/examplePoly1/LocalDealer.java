package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public class LocalDealer extends StateDealer {
    String city;
    CarDealerIntFace carInterface;

    public LocalDealer () {
        
    }
    
    public LocalDealer(String dealerName, String country, String state, CarDealerIntFace carInterface) {
        super(dealerName, country, state);
        this.carInterface = carInterface;
    }

    public void setCarInterface(CarDealerIntFace carInterface) {
        this.carInterface = carInterface;
    }

    public LocalDealer(String dealerName, String country, String state, String city) {
        super(dealerName, country, state);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void greeting (String dealerName) {
        System.out.println("Welcome to the " + dealerName);
    }

    @Override
    public String toString() {
        return "LocalDealer{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public void salePrice(int salePrice, int discounts, double tax) {
        System.out.println("local dealer sale price");
    }

    @Override
    public void inventory() {
        System.out.println("local dealer inventory");
    }
}
