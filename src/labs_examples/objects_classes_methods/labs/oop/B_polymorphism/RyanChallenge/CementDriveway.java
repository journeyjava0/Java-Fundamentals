package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class CementDriveway extends Concrete {
    public CementDriveway(String type) {
        super(type);
    }

    @Override
    public void getAmnt(int num) {
        System.out.println(num + " yards of cement are needed for the driveway");
    }


}
