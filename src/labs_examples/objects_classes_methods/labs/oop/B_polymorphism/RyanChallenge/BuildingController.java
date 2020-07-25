package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class BuildingController {

    public static void main(String[] args) {
       BuildingMaterials myHouse = new BuildingMaterials(new PlyWood(), new CementDriveway());
       myHouse.lumber.amnt(850);
       myHouse.concrete.amnt(300);
       myHouse.lumber.cost(5000);
       System.out.println(" ");

       BuildingMaterials house1 = new BuildingMaterials(new Studs(), new PatioCement());
       house1.lumber.amnt(500);
       house1.concrete.amnt(200);
       house1.lumber.cost(4000);
       System.out.println(" ");

       BuildingMaterials house2 = new BuildingMaterials(new Lumber(), new Concrete());
       house2.lumber.amnt(2);
       house2.concrete.amnt(4);
       house2.concrete.cost(500);
    }
}


