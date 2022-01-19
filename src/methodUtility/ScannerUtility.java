package methodUtility;

import java.util.Scanner;

public class ScannerUtility {
    private static Scanner scan;


    public static String askName() {
        scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        return scan.nextLine();
    }

    public static int askAge() {
        scan = new Scanner(System.in);
        System.out.println("Please enter you age: ");
        return scan.nextInt();
    }


}
