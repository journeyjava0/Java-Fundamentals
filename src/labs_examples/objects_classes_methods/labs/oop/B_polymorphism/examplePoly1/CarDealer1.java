package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public class CarDealer1 implements CarDealerIntFace {
    @Override
    public void salePrice(int salePrice, int discounts, double tax) {
        System.out.println("Price is $" + (salePrice - discounts * tax));
    }

    @Override
    public void tradeIn(int tradeValue, int markdown) {
        System.out.println("Tradein value is $" + (tradeValue - markdown));
    }

    @Override
    public void inventory() {
        String greeting = "There are vehicles on this lot";
        System.out.println(greeting);
    }
}
