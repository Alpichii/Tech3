package fileHandling;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {

        File file = new File("Java Interview Question.pdf");

        try{
            System.out.println("Check if file exists = " + file.exists());
            System.out.println("File name is = " + file.getName());
            System.out.println("File absolute path = " + file.getAbsolutePath());
            System.out.println("Can you read = " + file.canRead());
            System.out.println("Can you write = " + file.canWrite());
            System.out.println("File size = " + file.length());

        }catch(Exception e){
            System.out.println("Exception caught : " + e.getMessage());
        }

        try {
        file = new File("src/myExcelFile.xls");
        file.createNewFile();

            System.out.println("File absolute path = " + file.getAbsolutePath());
            System.out.println("File size = " + file.length());
            System.out.println("Can you read = " + file.canRead());
            System.out.println("Can you write = " + file.canWrite());
        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }

    }
}
