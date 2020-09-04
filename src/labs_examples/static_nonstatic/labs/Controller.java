package labs_examples.static_nonstatic.labs;

public class Controller {
    public static void main(String[] args) {
        //A static method calling another static method in the same class
        greeting1();

        //A static method calling a non-static method in the same class
        Controller myObj = new Controller();
        myObj.greeting2();

        //A static method calling a static method in another class
        Methods.greeting3();

        //A static method calling a non-static method in another class
        Methods myObj2 = new Methods();
        myObj2.greeting4();

        //A non-static method calling a non-static method in the same class
        //this will print greeting2 + "Greetings, non-static from non-static"
        //I'm just calling it here for practice
        myObj.greeting3();

        //A non-static method calling a non-static method in another class
        Methods newMyObj = new Methods();
        newMyObj.greeting5();

        //A non-static method calling a static method in the same class
        myObj.greeting5();

        //A non-static method calling a static method in another class
        myObj.greeting6();
    }
public static void greeting1() {
    System.out.println("Hello, this is a static method in the same class");
}

public void greeting2() {
    System.out.println("Hello, this is a non static method in the same class");
}

public void greeting3() {
        greeting2();
        System.out.println("Greetings, non-static from non-static");
}

public void greeting5(){
        greeting1();
    System.out.println("A non-static method calling a static method in the same class");
}

//A non-static method calling a static method in another class
    public void greeting6(){
        Methods.greeting3();
    }

}


