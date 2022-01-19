package ScannerPrograms;

import java.util.Scanner;

public class scannerProgram {
    public static void main(String[] args) {
        /*
        TASK-1
        Write a program that asks user to enter their firstname, last name and age

        EXAMPLE
        First name:
        John

        Last name:
        Doe

        Age:
        25

        EXPECTED OUTPUT:
        User is John Doe, and he is 25 years old

        PSEUDO CODE
        1. Create a Scanner object and import it
        2. Ask user for their name, last name and age
        3. Store this information in proper data types
        4. Then, print gathered information with a print statement
         */

    Scanner myScanner = new Scanner(System.in);
    System.out.println("First Name:");
    String firstName = myScanner.nextLine();

    System.out.println("Last Name:");
    String lastName = myScanner.nextLine();

    System.out.println("Age:");
    int age = myScanner.nextInt();

    System.out.println("user name is " + firstName + " " + lastName + " " + "and s/he is  " + age + " years old.");
    }
}