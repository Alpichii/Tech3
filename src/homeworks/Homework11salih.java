package homeworks;

import java.util.Arrays;

public class Homework11salih {
    public static void main(String[] args) {

        System.out.println("---TASK-8---");

        int[] numbers = {10, -13, 15, 70, 5, 57}; // 0, 23, 5, 60, 4, 47

        System.out.println(findClosestTo10(numbers));
    }


    public static int findClosestTo10(int[] arr) {

        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int num : arr) {
            if (num != 10 && Math.abs(10 - num) < Math.abs(10 - closest)) {
                closest = num;
            }
        }

        return closest;
    }
}
