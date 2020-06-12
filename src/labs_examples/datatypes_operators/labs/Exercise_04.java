package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // example of less than
        int a1 = 250;
        int b1 = 300;
        if (a1 < b1){
            System.out.println("a1 is less than b1");
        }

        // less than or equal to
        int a2 = 250;
        int b2 = 300;
        if (a2 <= b2){
            System.out.println("a2 is less than or equal to b2");
        }
        // greater than
        int a3 = 250;
        int b3 = 249;
        if (a3 > b3){
            System.out.println("a3 is greater than b3");
        }
        // greater than or equal to
        int a4 = 251;
        int b4 = 250;
        if (a4 >= b4){
            System.out.println("a4 is greater than or equal to b4");
        }

        // equal to
        int a5 = 250;
        int b5 = 250;
        if (a5 == b5){
            System.out.println("a5 is equal to b5");
        }
    }

}

