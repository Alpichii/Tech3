package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {


        int[] numbers = {10, 45, -32, 0, 0, 34};
        for (int element : numbers) {
            System.out.println(element);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"alex", "Adam", "Viktoriya", "Jo", "Tom"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        char[] characters = {'#', '6', 'H', 'a', '*' };

        Arrays.sort(characters);
        System.out.println("My characters array after sorting: " + Arrays.toString(characters));

        double[] balances = {100.65, 32.34, 1003.78, 30, 876.89, 16, 2500};
        Arrays.sort(balances);
        System.out.println(Arrays.toString(balances));


    }
}
