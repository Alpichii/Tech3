package ScannerPrograms;

import java.util.Scanner;

public class NextIssue {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = myScanner.next(); // nextInt(), nextDouble().....

        myScanner.nextLine();// this will resolve the issue

        System.out.println("Enter your address");
        String address = myScanner.nextLine();

        System.out.println("The first name is = " + firstName);
        System.out.println("The address is = " + address);
    }
}
