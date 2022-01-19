package loops.doWhileLoop;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter a number
        if number is more than or equal to 10, then finish the program
        but if number is less than 10,
        keep asking user to enter a new number until user enters a number
        that is more than or equal to 10

        Is this program going to run at least once?
         */
        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.println("Please enter a number:");
            number = input.nextInt();
        }
        while(number < 10);

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();


        while(number < 10){
            System.out.println("Please enter another number:");
            number = input.nextInt();
        }
         */


        System.out.println("End of the program!");

    }
}