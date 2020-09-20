package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        //Declare input and output file paths
        File inputFile = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\File1.txt");
        File outputFile = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\File1Encrypted.txt");
        File decryptedFile = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\File1Decrypted.txt");

        //use try w/ resources
        try (FileReader input = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(input);
            FileWriter fileWriter = new FileWriter(outputFile)) {

                int c;
                while ((c = bufferedReader.read()) != -1){

                    //change every 'a' to '-' and every 'e' to '~'
                    if((char) c == 'a'){
                        //ASCII for '-' is 45
                        c = 45;
                        fileWriter.write(c);
                    } else if ((char) c == 'e'){
                        //ASCII for 'e' is 126;
                        c = 126;
                        fileWriter.write(c);
                    }
                   else fileWriter.write((c));
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
                e.printStackTrace();
        }

        //Since try with resources was used, I don't need to use the nested catch statements to close file connections.
        //Now I have an "encrypted" file (File1Encrypted.txt) and now we need to decrypt it.

        //use try w/ resources
        try (FileReader input = new FileReader(outputFile);
             BufferedReader bufferedReader = new BufferedReader(input);
             FileWriter fileWriter = new FileWriter(decryptedFile)) {

            int c;
            while ((c = bufferedReader.read()) != -1){

                //change every '-' to 'a' and every '~' to 'e'
                if((char) c == '-'){
                    //ASCII for 'a' is 97
                    c = 97;
                    fileWriter.write(c);
                } else if ((char) c == '~'){
                    //ASCII for 'e' is 101;
                    c = 101;
                    fileWriter.write(c);
                }
                else fileWriter.write((c));
                System.out.print((char) c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}