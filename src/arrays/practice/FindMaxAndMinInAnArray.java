package arrays.practice;

import java.util.Arrays;

public class FindMaxAndMinInAnArray {
    public static void main(String[] args) {

        /*
        Create an int array to store below values
        -12
        -15
        8
        23
        67
        34
        45

        find min and max value from given array
        And print them with proper messages

        EXPECTED OUTPUT:
        Min is = -15
        Max is = 67
         */

        int[] numbers = {-12, -15, -1}; // -1

        System.out.println("\n--------1st way -  without sorting-------");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        System.out.println("Min is = " + min);
        System.out.println("Max is = " + max);


        System.out.println("\n--------2nd way -  with sorting-------");

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.println("Max is = " + numbers[numbers.length-1]);
        System.out.println("Min is = " + numbers[0]);

    }
}
