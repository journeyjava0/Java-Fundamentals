package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */


public class FlightParser {

    public static void main(String[]args){

        ArrayList<Flights> flights = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/flightData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                flights.add(mapValuesToFlightObject(values));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Writing the arraylist values back to a CSV file
        //Almost works! (thanks to SO :)
        //Question: Why does '0900' on the Southwest departure time change to '900' on the output back to CSV?
        //Note: Everything else stays the same
        //One solution would be to change the times from int to string in the POJO, but if you wanted to
        //do a calculation with the the 'string time' you'd have to convert to an int first
        String outputPath = "src/labs_examples/input_output/files/flightDataOutput.csv";
        try(FileWriter outputStream = new FileWriter(outputPath)){

            for(Flights flight : flights) {
            StringBuilder sb = new StringBuilder();
            sb.append(flight.getAirline() + ",");
            sb.append(flight.getDepartureTime() + ",");
            sb.append(flight.getDepartAirport() + ",");
            sb.append(flight.getArriveAirport());
            System.out.println(sb);
                outputStream.write(sb + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Flights mapValuesToFlightObject(String[] values){
        Flights flights = new Flights();

        flights.setAirline(values[0]);
        flights.setDepartureTime(Integer.parseInt(values[1]));
        flights.setDepartAirport(values[2]);
        flights.setArriveAirport(values[3]);

        return flights;
    }
}