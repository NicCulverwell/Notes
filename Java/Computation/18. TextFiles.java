package Computation;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class TextFiles {
    
    public static void main(String [] args) throws IOException{     // When reading from a file, "throws IOException" must be added at the end - comes with an import

        // The Improtance of Files
        // Persist Data/Information from one file to the next
        // Allow for the transfer of Data/Information
        // Organise our Data





        // Reading from a Text File
        // File/Scanner Classes


        File myFile = new File("myFile.txt");     // The file must exist within the same folder - the name must replicate that of the file within your folder - comes with an import

        Scanner inputFile = new Scanner(myFile);            // Scanners are used to read text from the file itself


        while(inputFile.hasNext()) {
            System.out.println(inputFile.nextLine());      // Process the next Line - this while loop allows the scanner to read the text file line by line
        }

    






        // PrintWriter Class

        PrintWriter outputFile = new PrintWriter("myFile.txt");      // This allows you to edit the txt document
        outputFile.println("Hello World");                                  // if the file does not exist, it will create it for you - comes with an import
        outputFile.println("My name is Nicholas Culverwell");               // if you go look at the myFile.txt file, it makes the file print out these lines


        inputFile.close();
        outputFile.close();
    }


}
