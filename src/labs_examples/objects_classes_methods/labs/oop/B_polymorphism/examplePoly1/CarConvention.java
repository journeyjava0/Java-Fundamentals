package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public class CarConvention {
    private CarDealerIntFace dealer;

    public CarConvention(CarDealerIntFace dealer) {
        this.dealer = dealer;
    }

    public void info () {
        dealer.inventory();
    }
}
