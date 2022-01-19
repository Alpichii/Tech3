package loops.controlStatement;

import java.util.Scanner;

public class UnderstandingBreakAndContinue {
    public static void main(String[] args) {
        /*
        Print all numbers from 1 to 50 included but skip below numbers
        7, 43, 13, 6
         */

        for (int i = 1; i <= 50; i++) {
            if(i == 6 || i == 7 || i == 13 || i == 43) {
                continue;
            }
            if(i != 50)System.out.print(i + " - ");
            else System.out.println(i);
        }

        /*
        Write a program that asks user to enter a number
        print all numbers starting from to given number
        but if the number given by user is more than 25, then stop at 25
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            if(i == 26) break;
            System.out.print(i + " - ");
        }
    }
}
