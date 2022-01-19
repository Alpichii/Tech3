package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Training2 {

    //Task2
    public static String replaceFirstLast(String str) {
        str = str.trim();
        if (str.length() < 2) return "";
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    //Task6
    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            if (arr[i].startsWith("a")) arr[i] = arr[i].replace(arr[i], "###");
        }
        return arr;
    }

    public static int[] no3or5(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) newArray[i] = 101;
            else if (arr[i] % 5 == 0) newArray[i] = 99;
            else if (arr[i] % 3 == 0) newArray[i] = 100;
            else newArray[i] = arr[i];
        }
        return newArray;
    }

    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                boolean isPrime = true;
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }


/*
public String[] fizzBuzz(int start, int end) {

  String[] result = new String[end-start];

  for (int i = start; i < end; i++) {
if ( i%3 == 0 && i%5 == 0 ) {


result[i-start] = "FizzBuzz";
} else if ( i%3 == 0 ) {
result[i-start] = "Fizz";
} else if ( i%5 == 0 ) {
result[i-start] = "Buzz";
} else {
result[i-start] = String.valueOf(i);
}
}
return result;
}

 */

    //Task8



    /*
    int[] prime =  new int[numbers.length];
    boolean isPrime = true;

    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i] % 2 == 0) prime[i] = 2;
    }
        for(int j = 2; j < numbers.length -1; j++) {
           if()
        }

        return prime;

*/


    public static void main(String[] args) {
        System.out.println("\n----------Task2----------\n");
        String str = "Hello";
        System.out.println(HomeworkR4.replaceFirstAndLast(str));

        System.out.println("\n-----------Task6----------\n");
        String[] t6 = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(t6)));

        System.out.println("\n-----------Task7----------\n");
        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(numbers)));

        System.out.println("\n-----------Task8----------\n");
        int[] t8 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(t8));



/*
        Count how many vowels and consonants there in below sentence
        1234 Abc Street, Chicago, IL 12345
        Digits: 9
        Letters: 18
        Uppercase: 5
        Lowercase: 13
        Vowels: 7
        Consonants: 11
        Spaces: 5
        Special characters: 2
          */

        System.out.println("---------------task9-----------");
        String address = "1234 Abc Street, Chicago, IL 12345";
        int countSpace = 0;

        for (int i = 0; i < address.length() - 1; i++) {
            if (Character.isWhitespace(address.charAt(i))) countSpace++;
        }
        System.out.println(countSpace);

        int countDigit = 0;

        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i))) countDigit++;
        }
        System.out.println(countDigit);

    }
}





