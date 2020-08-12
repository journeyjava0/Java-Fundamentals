package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.RyanChallenge;

public class BuildingController {

    public static void main(String[] args) {
       BuildingMaterials myHouse = new BuildingMaterials(new PlyWood(), new CementDriveway("Portland"));
       myHouse.lumber.getAmnt(850);
       myHouse.concrete.getAmnt(300);
       myHouse.lumber.getCost(5000);
       System.out.println(myHouse.concrete.getType());
       System.out.println(" ");

       BuildingMaterials house1 = new BuildingMaterials(new Studs(), new PatioCement("Other"));
       house1.lumber.getAmnt(500);
       house1.concrete.getAmnt(200);
       house1.lumber.getCost(4000);
       System.out.println(" ");

       BuildingMaterials house2 = new BuildingMaterials(new Lumber(), new Concrete("St Louis"));
       house2.lumber.getAmnt(2);
       house2.concrete.getAmnt(4);
       house2.concrete.getCost(500);

       Lumber deck = new Lumber();
       Concrete patio = new Concrete("Portland");
       BuildingMaterials house3 = new BuildingMaterials(deck, patio);
       house3.lumber.getAmnt(500);
       house3.concrete.setType("quickcrete");
       house3.lumber.getCost(5000);
       System.out.println(house3.concrete.getType());
    }
}


