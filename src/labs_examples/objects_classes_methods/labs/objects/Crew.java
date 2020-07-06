package labs_examples.objects_classes_methods.labs.objects;

public class Crew {
//This is a POJO and is used in the Airplane class
        int numPilots;
        int numFlightAttendants;

        public Crew(int numPilots, int numFlightAttendants) {
            this.numPilots = numPilots;
            this.numFlightAttendants = numFlightAttendants;
        }

        @Override
        public String toString() {
            return "Crew{" +
                    "numPilots=" + numPilots +
                    ", numFlightAttendants=" + numFlightAttendants +
                    '}';
        }

        public int getNumPilots() {
            return numPilots;
        }

        public void setNumPilots(int numPilots) {
            this.numPilots = numPilots;
        }

        public int getNumFlightAttendants() {
            return numFlightAttendants;
        }

        public void setNumFlightAttendants(int numFlightAttendants) {
            this.numFlightAttendants = numFlightAttendants;
        }
}



