package ScannerPrograms;


import java.util.Scanner;

public class Practice1 {
        public static void main(String[] args) {

            Scanner myScanner;
            myScanner = new Scanner(System.in);
            System.out.println("First name:");
            String firstName = myScanner.nextLine();

            System.out.println("Last name:");
            String lastName = myScanner.nextLine();

            System.out.println("Age:");
            int age = myScanner.nextInt();

            System.out.println("User is " + firstName + " " + lastName + " and s/he is " + age + " years old");
        }
    }

/*
    Write a program that asks user to enter 3 int numbers
    Store these numbers in proper variables
    Then find sum of them and print the result

    EXAMPLE:
    Please enter number 1:
    25

    Please enter number 2:
    40

    Please enter number 3:
    55

    EXPECTED OUTPUT:
    The sum of 25, 40, 55 is equal to 120
*/
/*
            Scanner myScanner = scan(System.in);
            System.out.println("Please enter number 1");
            int number1 = myScanner.nextInt();

            System.out.println("Please enter number 2");
            int number2 = myScanner.nextInt();

            System.out.println("Please enter number 3");
            int number3 = myScanner.nextInt();

            System.out.println("the sum of " + "number1" + " " + "number2" + " " + "number3" + "is equal to " + (number1 + number2 + number3));
*/




