package loops.whileLoop;

import java.util.Scanner;

public class FindProductOfNumbersByUser {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter some numbers and find the product of numbers given by user
        Example program
        Program: Please enter how many number you want to enter
        User: 3

        Program: Please enter number 1
        User: 10

        Program: Please enter number 2
        User: 7

        Program: Please enter number 3
        User: 8

        Expected output:
        560

        NOTE: if any number entered by user is 0 (zero), then do not multiply it with others
        Program: Please enter how many number you want to enter
        User: 2

        Program: Please enter number 1
        User: 5

        Program: Please enter number 2
        User: 0

        Expected output:
        5
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many number you want to enter");
        int entered = scanner.nextInt();

        int product = 1;
        for (int i = 1; i <= entered; i++) {
            System.out.println("Then, please enter number " + i);
            int newNumber = scanner.nextInt();
            if(newNumber !=0)product *= newNumber;
        }
        System.out.println("The sum of your " + entered + " numbers is = " + product);
    }
}