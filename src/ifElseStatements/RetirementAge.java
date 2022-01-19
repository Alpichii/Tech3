package ifElseStatements;

import java.util.Scanner;

public class RetirementAge {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their age
        And print "It is your time get retired!" if their age is more than or equal to 55!
        And print "You cannot be retired at this age" if their age is less than 55

        PSEUDO CODE
        1. Create scanner object
        2. Ask user to enter their age
        3. Check if age is more than or equal to 55
        4. Based on check print messages
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int userAge = input.nextInt();
        int age = 55;

        if (userAge >= 55) {
            System.out.println("It is your time to get retired!");
        } else {
            System.out.println("You cannot be retired at this age");
        }

        System.out.println("End of the program!");
    }
}
