package stringOfMethods.practice;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their name and city they live
        Print true if name starts with "a" and city is Chicago (ignore case for both name and city)
        Print false otherwise

        PSEUDO CODE
        1. I will use Scanner to ask and read data from user
        2. I will store data that I got from user
        3. I will use if else statements to check given condition
        4. Based on conditions, I will print the result

        Expected result:
        Alex, Chicago   -> true
        Alex, Texas     -> false
        Burak, chicago  -> false
        alper, CHICAGO  -> true
        Jasmin, Miami   -> false
        AlPeR, ChICaGo  -> true  128
         */

        // 2 boolean - 1 is name starting with a or A - 2 is city being Chicago ignoring case

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = input.nextLine();
        System.out.println("Please enter your city");
        String cityName = input.nextLine();

        System.out.println(firstName.toLowerCase().startsWith("a") && cityName.equalsIgnoreCase("Chicago"));
    }
}

