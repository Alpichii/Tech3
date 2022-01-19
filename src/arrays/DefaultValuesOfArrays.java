package arrays;

import java.util.Arrays;

public class DefaultValuesOfArrays {

    public static void main(String[] args) {
        String[] words = new String[5];

        System.out.println(Arrays.toString(words)); // [null, null, null, null, null]

        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        byte[] nums = new byte[20];
        System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        double[] balances = new double[12];
        System.out.println(Arrays.toString(balances)); // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

        boolean[] varName = new boolean[4];
        System.out.println(Arrays.toString(varName)); // [false, false, false, false]

        char[] characters = new char[8];
        System.out.println(Arrays.toString(characters));// [, , , , , , , ]

        Integer[] myNumbers = new Integer[15];
        System.out.println(Arrays.toString(myNumbers));
    }
}
