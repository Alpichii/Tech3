package loops.forLoop;

public class PrintFactorialNumber {
    public static void main(String[] args) {
/*
        5! = 5 * 4 * 3 * 2 * 1
        5! = 120

        3! = 3 * 2 * 1
        3! = 6

        7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
        7! = 5040

        Write a fori loop to calculate 6!
        Write a program that finds the result of numbers multiplied with each other starting from 1 to 6
        6! = 6 * 5 * 4 * 3 * 2 * 1
        6! = 1 * 2 * 3 * 4 * 5 * 6

        Expected output:
        720
         */

        int factorial = 1;
        for (int i = 2; i <= 6; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
