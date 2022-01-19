package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyArrayElements {
    public static void main(String[] args) {

        /*
        Ask user to enter 3 positive numbers
        Store them in an array
        Print the array
        Print the sorted
        Find all the numbers multiplication result and print it

        EXAMPLE:
        Program: Please enter 3 positive numbers
        User: 4 7 5

        Program:
        Array before sorting: [4, 7, 5]
        Array after sorting : [4, 5, 7]
        Array elements multiplied: 140
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 positive numbers");

        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }

        System.out.println("Array elements multiplied: " + product);



    }
}
