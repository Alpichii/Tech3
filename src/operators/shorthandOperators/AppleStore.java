package operators.shorthandOperators;


import java.util.Scanner;

public class AppleStore {
    public static void main(String[] args) {
    /*
    imagine that we have Apple Store
    and we have 10 MacBook Pro in the morning
    Write a program that asks employee "How many MacBook Pro did you sell today?"
    Subtract employee's answer from total number of MacBooks that you had in the morning and print
    EXAMPLE PROGRAM:
    Program: How many MacBook Pro did you sell today?
    Employee :4
    program: Than, 6 MacBook Pro left in out store
     */
        Scanner Input = new Scanner(System.in);

        System.out.println("How many MacBook Pro did you sell today?");
        int sell = Input.nextInt();

        int totalNumber = 10;
        totalNumber -= sell;

        System.out.println("Then, " + totalNumber + " MacBook Pro left in out store");
    }
}
