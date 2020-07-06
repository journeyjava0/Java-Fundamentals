package labs_examples.objects_classes_methods.labs.objects;

public class Seat {
//This is a POJO and is used in the Airplane class
        int numSeats;
        int numAisles;

        public Seat(int numSeats, int numAisles) {
            this.numSeats = numSeats;
            this.numAisles = numAisles;
        }

        @Override
        public String toString() {
            return "Seats{" +
                    "numSeats=" + numSeats +
                    ", numAisles=" + numAisles +
                    '}';
        }

        public int getNumSeats() {
            return numSeats;
        }

        public void setNumSeats(int numSeats) {
            this.numSeats = numSeats;
        }

        public int getNumAisles() {
            return numAisles;
        }

        public void setNumAisles(int numAisles) {
            this.numAisles = numAisles;
        }
}


