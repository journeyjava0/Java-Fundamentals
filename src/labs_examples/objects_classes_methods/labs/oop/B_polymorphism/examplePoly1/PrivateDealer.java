package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

public class PrivateDealer extends StateDealer {

    @Override
    public void salePrice(int salePrice, int discounts, double tax) {
        System.out.println("private dealer sale price");
    }

    @Override
    public void inventory() {
        System.out.println("private delaer inventory");
    }
}
