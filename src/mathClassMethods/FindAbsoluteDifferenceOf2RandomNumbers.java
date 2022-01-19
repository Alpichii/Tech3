package mathClassMethods;

public class FindAbsoluteDifferenceOf2RandomNumbers {
    public static void main(String[] args) {
/*
        Write a program that generates 2 random numbers between 10 and 25 both included
        max - min + 1 -> how many numbers you need
        25 - 10 + 1 = 16
        Then, first print the random numbers
        Finally, find the absolute difference between the numbers and print the result

        EXPECTED OUTPUT:
        First number is = {firstNumber}
        Second number is = {secondNumber}
        Absolute difference of {firstNumber} and {secondNumber} = {absoluteDifference}
         */

        /*
        0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
        10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

        25
        12
        13
        Math.abs(first - second)
         */

        int first = (int)(Math.random() * 16) + 10;
        int second = (int)(Math.random() * 16) + 10;
        int absDiff = Math.abs(second - first);

        System.out.println("First number is = " + first);
        System.out.println("Second number is = " + second);
        System.out.println("Absolute difference of " + first + " and " + second + " = " + absDiff);

        /*
        int firstNumber = (int)((Math.random()) * 16 + 10);
        int secondNumber = (int)((Math.random()) * 16 + 10);
        int absDiff = Math.abs(secondNumber -  firstNumber);

        System.out.println("First number is = " + firstNumber + "\nSecond number is = " + secondNumber +
                "\nAbsolute difference of " + firstNumber + " and " + secondNumber + " = " + absDiff);

         */
    }
}
