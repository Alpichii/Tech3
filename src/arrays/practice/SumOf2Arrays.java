package arrays.practice;

import java.util.Arrays;

public class SumOf2Arrays {
    public static void main(String[] args) {
        /*
        TASK-1
        Find some numbers given with arrays below
        And print the array

        EXPECTED RESULT:
        [17.0, 15.0, 15.0, 17.0, 11.0]
        */

        /*
        TASK-1
        Find some of numbers given with arrays below
        And print the array

        EXPECTED RESULT:
        [17.0, 15.0, 15.0, 17.0, 11.0]
         */

        System.out.println("\n--------TASK-1----------\n");
        double[] arr1 = {10.5, 12.7, 7.5, 3.3, 2.4};
        double[] arr2 = {6.5, 2.3, 7.5, 13.7, 8.6};

        double[] arrSum = new double[arr1.length];

        for (int i = 0; i <arrSum.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }

        System.out.println(Arrays.toString(arrSum));

        /*
        TASK-2
        Find some of numbers given with arrays below
        And print the array

        EXPECTED RESULT:
        [11, 25, 35, 51, 58, 10, 7, 9]
         */
        System.out.println("\n--------TASK-2----------\n");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {10, 23, 32, 47, 53, 10, 7, 9};

        int[] sum = new int[8];

        //first part coming from both arrays with the length of short one
        for (int i = 0; i < 5; i++) {
            sum[i] = nums1[i] + nums2[i];
        }
        //[11, 25, 35, 51, 58, 0, 0, 0]

        //Second part coming from long array
        for (int i = 5; i <= 7; i++) {
            sum[i] = nums2[i];
        }

        System.out.println(Arrays.toString(sum));
    }
}
