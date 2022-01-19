package arrays.practice;

public class FindSumOfElements {
    public static void main(String[] args) {

        /*
        TASK-1
        Create an int array to store below numbers

        10
        5
        -3
        23
        45
        10
        7

        Find the sum of all the numbers and print with message

        EXPECTED OUTPUT:
        97
         */

        System.out.println("\n---------TASK-1----------\n");

        int[] numbers =  {10, 5, -3, 23, 45, 10, 7, -77};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);

        /*
        TASK-2
        Use the same array above
        And find sum of first 4 numbers

        EXPECTED OUTPUT:
        35
         */

        System.out.println("\n---------TASK-2----------\n");

        int sumOfFirst4 = 0;
        for (int i = 0; i <= 3; i++) {
            sumOfFirst4 += numbers[i];
        }

        System.out.println(sumOfFirst4);

        /*
        TASK-3
        Use the same array above
        And find sum of last 4 numbers

        EXPECTED OUTPUT:
        85
         */

        System.out.println("\n---------TASK-3----------\n");

        int sumOfLast4 = 0;
        for (int i = numbers.length-1; i >= numbers.length-4 ; i--) {
            sumOfLast4 += numbers[i];
        }

        System.out.println(sumOfLast4);

        /*
        TASK-4
        Use the same array above -> 10, 5, -3, 23, 45, 10, 7
        And find sum of every other numbers starting from index of 0

        EXPECTED OUTPUT:
        59
         */

        System.out.println("\n---------TASK-4----------\n");

        int sumOfEveryOther = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfEveryOther += numbers[i];
            i++;
        }

        System.out.println(sumOfEveryOther);


        /*
        TASK-5
        Use the same array above -> 10, 5, -3, 23, 45, 10, 7
        And find sum even numbers only

        EXPECTED OUTPUT:
        20
         */

        System.out.println("\n---------TASK-5----------\n");

        int sumOfEvens = 0;
        for (int number : numbers) {
            if(number % 2 == 0) sumOfEvens += number;
        }

        System.out.println(sumOfEvens);

        /*
        TASK-6
        Use the same array above -> 10, 5, -3, 23, 45, 10, 7
        And find sum odd numbers that are positive only

        EXPECTED OUTPUT:
        80
         */

        System.out.println("\n---------TASK-6----------\n");
        int sumOfOddsPositive = 0;
        for (int number : numbers) {
            if(number % 2 != 0 && number > 0) sumOfOddsPositive += number;
        }

        System.out.println(sumOfOddsPositive);
    }
}
