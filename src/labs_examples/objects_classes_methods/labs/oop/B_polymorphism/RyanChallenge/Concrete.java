package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class Concrete implements Amount {

    @Override
    public void amnt(int num) {
        System.out.println(num + " yards of concrete are needed");
    }

    @Override
    public void cost(int cost) {
        System.out.println("The total cost is $" + cost);
    }
}
