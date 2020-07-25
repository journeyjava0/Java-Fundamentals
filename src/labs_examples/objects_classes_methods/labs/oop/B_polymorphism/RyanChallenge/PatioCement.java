package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class PatioCement extends Concrete {
    @Override
    public void amnt(int num) {
        System.out.println(num + " yards of concrete are needed for the patio");
    }
}
