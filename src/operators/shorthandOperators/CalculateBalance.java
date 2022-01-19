package operators.shorthandOperators;

import java.util.Scanner;

public class CalculateBalance {
    public static void main(String[] args) {
        /*
         Write a Java program that asks user their balance and one day transaction.
         Subtract each transaction from balance and return new balance using shorthand operator
         Requirements:
         Use Scanner class to read input from user
         Test data:
         Balance = $100.00
         1st transaction = $25.75
         2nd transaction =  $12.50
         3rd transaction = $7.25

         Expected output:
         Balance after 1st transaction = $74.25
         Balance after 2nd transaction = $61.75
         Balance after 3rd transaction = $54.5
         */
        double balance = 100;
        System.out.println("Balance at the beginning is : $" + balance);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first expense?");
        double firstExpense = scanner.nextDouble();

        System.out.println("What is your second expense?");
        double secondExpense = scanner.nextDouble();

        System.out.println("What is your third expense?");
        double thirdExpense = scanner.nextDouble();

        System.out.println("Balance after 1st tran saction = $" + (balance -= firstExpense));
        System.out.println("Balance after 2nd transaction = $" + (balance -= secondExpense));
        System.out.println("Balance after 3rd transaction = $" + (balance -= thirdExpense));


    }
}
