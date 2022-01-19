package arrays;

import java.util.Arrays;

public class NumbersArray {
    public static void main(String[] args) {
/*
        Create an int array to store below numbers
        -12, 6, 0, 15, 23

        Then print the array
        Print the length of the array
        Print the first element in the array
        Print the last element in the array

        EXPECTED OUTPUT:
        [-12, 6, 0, 15, 23]
        5
        -12
        23
         */
        int[] numbers = {-12, 6, 0, 15, 23};

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);



    }
}
