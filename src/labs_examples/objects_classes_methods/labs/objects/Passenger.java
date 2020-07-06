package labs_examples.objects_classes_methods.labs.objects;

public class Passenger {
//This is a POJO and is used in the Airplane class
        int numPassengers;

        public Passenger(int numPassengers) {
            this.numPassengers = numPassengers;
        }

        @Override
        public String toString() {
            return "Passengers{" +
                    "numPassengers=" + numPassengers +
                    '}';
        }

        public int getNumPassengers() {
            return numPassengers;
        }

        public void setNumPassengers(int numPassengers) {
            this.numPassengers = numPassengers;
        }
}


