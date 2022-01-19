package ifElseStatements;

import java.util.Scanner;

public class PositiveNegativeNeutral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("POSITIVE");
        }
        if(number < 0){
            System.out.println("NEGATIVE");
        }
        if(number == 0) {
            System.out.println("NEUTRAL");
        }
        System.out.println("End of the program!");

 */
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("NEUTRAL");
        }
        else if (number > 0) {
            System.out.println("POSITIVE");
        }
        else {
            System.out.println("NEGATIVE");
        }

        System.out.println("End of the program!");
    }
}
