package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        // example of AND
        boolean a1 = true;
        boolean b1 = true;
        if (a1 & b1){
            System.out.println("a1 and b1 are true");
        }

        // example of short circuit AND
        boolean a2 = true;
        boolean b2 = true;
        if (a2 && b2){
            System.out.println("a2 and b2 are true");
        }

        //example of OR
        boolean a3 = false;
        boolean b3 = true;
        if (a3 | b3) {
            System.out.println("a3 or b3 is true");
        }

        //example of short ciruit OR
        boolean a4 = false;
        boolean b4 = true;
        if (a4 || b4) {
            System.out.println("a4 or b4 is true");
        }

        //example of XOR
        boolean a5 = true;
        boolean b5 = true;
        if (a5 ^ b5) {
            System.out.println("a5 or b5 is true"); //both true so nothing will print to console
        }

        //example of NOT
        boolean a6 = true;
        boolean b6 = false;
        if (!b6) {
            System.out.println("b6 is true");
        }
    }

}

