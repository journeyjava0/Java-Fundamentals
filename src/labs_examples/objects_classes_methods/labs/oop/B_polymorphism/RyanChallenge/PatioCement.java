package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class PatioCement extends Concrete {
    public PatioCement(String type) {
        super(type);
    }

    @Override
    public void getAmnt(int num) {
        System.out.println(num + " yards of concrete are needed for the patio");
    }
}
