package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class Lumber implements Amount {

    @Override
    public void amnt(int num) {
        System.out.println(num + " sq ft of lumber needed");
    }

    @Override
    public void cost(int cost) {
        System.out.println("Lumber cost is $" + cost);
    }
}
