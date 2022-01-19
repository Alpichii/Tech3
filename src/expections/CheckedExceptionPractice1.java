package expections;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionPractice1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);

            //one way to handle checked exception with try-catch blocks
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception caught : " + e.getMessage());
            }
        }
            File file = new File("StudentNames.xls");
            file.createNewFile();
            file.delete();
    }
}
