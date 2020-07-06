package labs_examples.objects_classes_methods.labs.objects;

public class JetEngine {
//This is a POJO and is used in the Airplane class
        int numEngines;
        String engineMake;

        public JetEngine(int numEngines, String engineMake) {
            this.numEngines = numEngines;
            this.engineMake = engineMake;
        }

        @Override
        public String toString() {
            return "Engines{" +
                    "numEngines=" + numEngines +
                    ", engineMake='" + engineMake + '\'' +
                    '}';
        }

        public int getNumEngines() {
            return numEngines;
        }

        public void setNumEngines(int numEngines) {
            this.numEngines = numEngines;
        }

        public String getEngineMake() {
            return engineMake;
        }

        public void setEngineMake(String engineMake) {
            this.engineMake = engineMake;
        }
}




