package loops.doWhileLoop;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter a number
if number is dividable by 5 then finish the program but
if number is not dividable by 5, keep asking user to enter
a new number until user enters a number that is dividable by 5
 */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num;

        do {
            System.out.println("Please enter a number:");
            num = input.nextInt();
        }
        while (num % 5 != 0);
        System.out.println(num);
    }
}

