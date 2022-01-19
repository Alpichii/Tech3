package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhiteBoardPracticeStudySheet {

    static int[] numbers = {2, 0, 4, 1, 0, 5, 3, 5, 5};

    public static void main(String[] args) {
        System.out.println("\nQuestion-27\n");

        System.out.println(removeDuplicates27(numbers));

        System.out.println("\nQuestion-33\n");
        System.out.println(Arrays.toString(getFibo33(10)));

        System.out.println("\nQuestion-47\n");
        int[] numbers = {2, 0, 4, 1, 0, 5, 3, 5, 5};
        System.out.println(findMax47WithoutSorting(numbers));
        //System.out.println(findMax47WithSorting(numbers));

        System.out.println("\nQuestion-49\n");
        System.out.println(findSecondMax49WithoutSorting(numbers));
        //System.out.println(findSecondMax49WithSorting(numbers));

        System.out.println("\nQuestion-44\n");
        String word = "Java is fun";
        System.out.println(reverseWord(word));


    }

    
    public static List<Integer> removeDuplicates27(int[] numbers){
        List<Integer> withoutDuplicates = new ArrayList<>();

        for (int number : numbers) {
            if (!withoutDuplicates.contains(number)) withoutDuplicates.add(number);
        }

        return withoutDuplicates;
    }

    public static int[] getFibo33(int length){ //10
        int[] fibo = new int[length];
        int first = 0;
        int second = 1;

        for (int i = 0; i < length; i++) { //i=3
            fibo[i] = first;

            int third = first + second;

            first = second;
            second = third;
        }

        return fibo;
    }

    public static int findMax47WithSorting(int[] numbers){

        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static int findSecondMax49WithSorting(int[] numbers){
        int max = findMax47WithSorting(numbers);

        //0,0,1,2,3,4,5,5,5

        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != max) return numbers[i];
        }

        return -1; // Error! There is no second max
    }

    public static int findMax47WithoutSorting(int[] numbers){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i]; // condition
            //max = Math.max(numbers[i], max);        // Math class
        }

        return max;
    }

    public static int findSecondMax49WithoutSorting(int[] numbers){
        int max = findMax47WithoutSorting(numbers);
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != max && numbers[i] > secondMax) secondMax = numbers[i];
        }

        return secondMax;
    }

    //44.	Write a method that takes a String as argument and returns the String back with each word reversed in the same place
    public static String reverseWord(String str) {
        String[] empty = str.split(" ");
        String reverse = "";
        for (int i = empty.length - 1; i >= 0; i--) {
            reverse += empty[i] + " ";
        }
        return reverse.trim();
    }



}
