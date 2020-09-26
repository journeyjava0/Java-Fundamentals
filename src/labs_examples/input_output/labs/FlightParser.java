package labs_examples.input_output.labs;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        ArrayList<Flight> flights = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/files/flightData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split("[,./@]");
                flights.add(mapValuesToFlightObject(values));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        long currentTime = System.currentTimeMillis();
//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
//        String humanDate = sdf.format(d);

        //Writing the arraylist values back to a CSV file
        //Almost works! (thanks to SO :)
        //Question: Why does '0900' on the Southwest departure time change to '900' on the output back to CSV?
        //Answer: Because for type 'int' 0900 is the same thing as 900 !!
        //Note: Everything else stays the same
        //One solution would be to change the times from int to string in the POJO, but if you wanted to
        //do a calculation with the the 'string time' you'd have to convert to an int first
        String outputPath = "src/labs_examples/input_output/files/flightDataOutput.csv";
        try(FileWriter outputStream = new FileWriter(outputPath)){

            for(Flight flight : flights) {
                StringBuilder sb = new StringBuilder();
                sb.append(flight.getAirline() + ",")
                    .append(flight.getDepartureTime() + ",")
                    .append(flight.getDepartAirport() + ",")
                    .append(flight.getArriveAirport());
                System.out.println(sb);
                outputStream.write(sb + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Flight mapValuesToFlightObject(String[] values){
        Flight flight = new Flight();

        flight.setAirline(values[0]);
        flight.setDepartureTime(values[1]);
        flight.setDepartAirport(values[2]);
        flight.setArriveAirport(values[3]);

        return flight;
    }
}