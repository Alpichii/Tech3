package ifElseStatements;

import java.util.Scanner;

public class ColorCode {
    /*
 Write a program defines what color you will wear for each work day
 Ask user to enter the day from 1 to 5
 1 Monday    -> you wear blue
 2 Tuesday   -> you wear green
 3 Wednesday -> you wear red
 4 Thursday  -> you wear yellow
 5 Friday    -> you wear orange
  *//*
 Write a program defines what color you will wear for each work day
 Ask user to enter the day from 1 to 5
 1 Monday    -> you wear blue
 2 Tuesday   -> you wear green
 3 Wednesday -> you wear red
 4 Thursday  -> you wear yellow
 5 Friday    -> you wear orange
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day from 1 to 5: ");
        int day = input.nextInt();

        if (day == 1) {
            System.out.println("you wear blue");
        } else if (day == 2) {
            System.out.println("you wear green");
        } else if (day == 3) {
            System.out.println("you wear red");
        } else if (day == 4) {
            System.out.println("you wear yellow");
        } else if (day == 5) {
            System.out.println("you wear orange");
        } else {
            System.out.println("THE NUMBER YOU ENTERED IS WRONG");
        }


        System.out.println("---------------------switch method-----------------");
        switch (day) {   //byte, short, int, char, String, enum --> using only this dataType
            case 1:
                System.out.println("you wear blue");
                break;
            case 2:
                System.out.println("you wear green");
                break;
            case 3:
                System.out.println("you wear red");
                break;
            case 4:
                System.out.println("you wear yellow");
                break;
            case 5:
                System.out.println("you wear orange");
                break;
            default:
                System.out.println("THE NUMBER YOU ENTERED IS WRONG");
                //No need for break

                System.out.println("End of the program!");
        }
    }
}