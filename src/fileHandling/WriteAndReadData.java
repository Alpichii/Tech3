package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteAndReadData {
    public static void main(String[] args) {
        //Create a File object first
        File file = new File("myFirstFile.txt");

        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file.getName()); // Create if it does not exist
            fileWriter.write("Alper");
            fileWriter.write("\njef");
            fileWriter.write("\nolya");
            fileWriter.write("\nburak");
            fileWriter.write("\nalpi");
            fileWriter.close();

            //Use Scanner to read a file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println("the line says " + scanner.nextLine());
            }

            //delete the file
            file.delete();

        }
        catch (Exception e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}
