package stringOfMethods.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
Write a Java program that asks user to enter 2 strings
And store answers of user in different Strings
Finally, check if given 2 strings are equal or not and print messages given below

Test data 1:
Java is fun
Hello World

Expected output 1:
These strings are not equal

Test data 2:
Hello
Hello

Expected output 2:
These strings are equal
 */
        System.out.println("Please enter a 2 strings");

        String fir = input.nextLine();
        String sec = input.nextLine();

        boolean check = fir.equals(sec);
        if (check) {
            System.out.println("These strings are equal");
        } else
            System.out.println("These strings are not equal");

        //   ---------Akin's solution------------

        System.out.println("Please enter something");
        String ss1 = input.nextLine();

        System.out.println("Please enter something else");
        String ss2 = input.nextLine();

        System.out.println("The first info entered is = " + ss1);
        System.out.println("The second info entered is = " + ss2);


        if(ss1.equals(ss2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        //Ternary operator
        //System.out.println(s1.equals(s2) ? "These strings are equal" : "These strings are not equal");

        System.out.println("END OF THE PROGRAM!!!");
    }
}