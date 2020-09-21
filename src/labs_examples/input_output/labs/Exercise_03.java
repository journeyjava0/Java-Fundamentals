package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams
 * 2) Demonstrate the usage of at least two additional Character Streams
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */

public class Exercise_03 {
    public static void main(String[] args) {

        //Example of a byte stream with a buffer
        byte1();

        //Example of a character stream with a buffer
        char1();

        //Example of DataInputStream and DataOutputStream
        data1();
    }

    public static void byte1() {
        //defining the file paths
        File in1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\byteIn.txt");
        File out1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\byteOut.txt");

        //this will output in bytecode format, just for fun :)
        try (FileInputStream in = new FileInputStream(in1);
             FileOutputStream out = new FileOutputStream(out1);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(in)) {
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                out.write(bytesRead);

                //Use line below to convert to text in the terminal
                //System.out.print(new String(buffer, 0, bytesRead));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("buffered byte stream complete.");
    }

    public static void char1() {
        File in1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\charIn.txt");
        File out1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\charOut.txt");
        try (FileReader fileReader1 = new FileReader(in1);
             FileWriter fileWriter1 = new FileWriter(out1);
             BufferedReader bufferedReader = new BufferedReader(fileReader1)) {

            int c;
            while ((c = bufferedReader.read()) != -1) {
                fileWriter1.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("buffered char stream complete.");
    }

    public static void data1() {
        File dataIn1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\dataIn.txt");
        File dataOut1 = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\dataOut.txt");
        try (FileInputStream in = new FileInputStream(dataIn1);
             FileOutputStream out = new FileOutputStream(dataOut1);
             DataInputStream dIn = new DataInputStream(in);
             DataOutputStream dOut = new DataOutputStream(out)) {

            int c;
            while ((c = dIn.read()) != -1) {
                dOut.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("data stream complete.");
    }
}
