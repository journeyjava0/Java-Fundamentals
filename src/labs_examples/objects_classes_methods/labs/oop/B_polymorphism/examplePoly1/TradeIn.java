package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.examplePoly1;

abstract class TradeIn implements CarDealerIntFace {
    @Override
    public void tradeIn(int tradeValue, int markdown) {
        System.out.println("Your trade in is " + (tradeValue - markdown));
    }
}
