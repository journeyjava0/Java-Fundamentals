package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsoluteFile());
        //Question: How do I specify the file path?
        File relativeFile = new File("C:\\Users\\Owner\\Desktop\\Coding\\Learning_Java\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\OriginalFile.txt");
        //"C:\Users\Owner\Desktop\Coding\Learning Java\CodingNomads\labs\online-java-fundamentals\src\labs_examples\input_output\labs\OriginalFile.txt"
        //"/labs/OriginalFile.txt"
        File outputFilePath = new File("C:\\Users\\Owner\\Desktop\\OutputFile.txt");


        try(FileReader input2 = new FileReader(relativeFile);
            BufferedReader bufferedReader2 = new BufferedReader(input2);
            FileWriter fileWriter2 = new FileWriter(outputFilePath)) {


            int bytesRead = 0;
            while ((bytesRead = bufferedReader2.read()) != -1){
                fileWriter2.write(bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

