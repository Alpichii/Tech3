package fileHandling;

import java.io.File;

public class CreatingFile {
    public static void main(String[] args) {

        //Create a file object file
        File file = new File("myFirstFile.txt");
        try {
            if(file.createNewFile()) System.out.println("A new file is created");
            else System.out.println("A new file is not created");

        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }

    }
}
