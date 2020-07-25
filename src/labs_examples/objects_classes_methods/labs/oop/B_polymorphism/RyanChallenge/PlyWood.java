package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class PlyWood extends Lumber {
    @Override
    public void getAmnt (int sqFt) {
        System.out.println(sqFt + " sq ft of plywood required");
    }
}
