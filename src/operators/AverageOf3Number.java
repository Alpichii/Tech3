package operators;

import java.util.Scanner;

public class AverageOf3Number {
    /*
Write a program that asks user to enter 3 double numbers
Then, find average of those 3 numbers
Test Data:
5
25
60

Expected result:
Average of 5, 25 and 60 is = 30
PSEUDO CODE:
1.Create a Scanner Object to get input from user
2.Ask user to enter numbers and store those answers in proper variables
3.Find average of given numbers and print result
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter 3 Numbers");
        double i1, i2, i3;

        i1 = input.nextDouble();
        i2 = input.nextDouble();
        i3 = input.nextDouble();

        double average = (i1 + i2 + i3) / 3;
        System.out.println("Average of " + i1 + ", " + i2 + " and " + i3 + " is = " + average);
    }
}
