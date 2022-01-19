package projects;

import java.util.Arrays;

public class Project05 {
    //Task-1
    public static void findGreatestAndSmallest(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int number : arr) {
            if (number < min) min = number;
            else if (number > max) max = number;
        }

        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    //Task-2
    public static void findGreatestAndSmallestWithSort(int[] arr) {
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    //Task-3
    public static void findSecondGreatestAndSmallest(int[] arr) {

        //12
        //1
        int min = arr[0];
        int max = arr[0];

        for (int number : arr) {
            if (number < min) min = number;
            else if (number > max) max = number;
        }
        //
        int secMax = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;

        //3 1 1 5 12 12 7
        for (int number : arr) {
            if (number > secMax && number != max) secMax = number;
            else if (number < secMin && number != min) secMin = number;
        }
        System.out.println("Second Smallest = " + secMin);
        System.out.println("Second Greatest = " + secMax);
    }

    //Task-4
    public static void findSecondGreatestAndSmallestWithSort(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];

        for (int number : arr) {
            if (number != min) {
                System.out.println("Second Smallest = " + number);
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != max) {
                System.out.println("Second Smallest = " + arr[i]);
                break;
            }
        }
    }

    //Task-5
    public static void findDuplicatedElementsInAnArray(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    System.out.println(arr[i]);
            }
        }
    }

    //Task-6
    public static void findMostRepeatedElementInAnArray(String[] arr) {

        Arrays.sort(arr);
        String element = "";
        int maxCount = 1;
        int count=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i].equals(arr[i - 1]))
                count++;
            else{
                if(count > maxCount){
                    maxCount = count;
                    element = arr[i-1];
                }
                count =1;
            }
        }
        System.out.println(element);
    }

    public static void main(String[] args) {

        System.out.println("\n----------TASK-1----------\n");

        int[] numbers = {10, 5, 6, 7, 8, -10, -3, 15};
        Project05.findGreatestAndSmallest(numbers);

        System.out.println("\n----------TASK-2----------\n");

        int[] numbers2 = {10, 5, 6, 7, 8, -10, -3, 15};
        Project05.findGreatestAndSmallestWithSort(numbers2);

        System.out.println("\n----------TASK-3----------\n");

        int[] numbers3 = {10, 5, 6, 7, 8, 5, 15, 15};
        Project05.findSecondGreatestAndSmallest(numbers3);

        System.out.println("\n----------TASK-4----------\n");

        int[] numbers4 = {10, 5, 6, 7, 8, 5, 15, 15};
        Project05.findSecondGreatestAndSmallestWithSort(numbers4);

        System.out.println("\n----------TASK-5----------\n");

        String[] foobar = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        Project05.findDuplicatedElementsInAnArray(foobar);

        System.out.println("\n----------TASK-6----------\n");

        String[] elements = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        Project05.findMostRepeatedElementInAnArray(elements);
    }
}




