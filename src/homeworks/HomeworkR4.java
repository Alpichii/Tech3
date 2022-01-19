package homeworks;

import java.time.LocalDateTime;
import java.util.Arrays;

public class HomeworkR4 {
    //Task1
    /*
    Is this method return type? or void?
    If it is return type, then ask what it returns?
    Does it take any argument? If yes, what arguments it takes?
    Is method static? Does it belong to class or object?
    If it belongs to class -> static
    If it belongs to object -> non-static

    "feyza" -> aeyzf
    "java"  -> aavj
    " a "     -> "" -> eger length 2 den az ise o zaman empty return et





     */

    public static String noSpace(String str) {
        return str.replace(" ", "");
    }

    //Task2
    public static String replaceFirstAndLast(String str){
        if(str.trim().length() >= 2){
            return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
        }
        return "";
    }

    //Task3
    public static boolean hasVowel(String str) {
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Task4
    public static void checkAge(int yearOfBirth) {
        LocalDateTime currentDate = LocalDateTime.now();
        int currentYear = currentDate.getYear();
        if (yearOfBirth >= currentYear || currentYear - yearOfBirth >= 100) System.out.println("AGE IS NOT VALID");
        else if (currentYear - yearOfBirth >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }

    //Task5
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    //Task6
    public static String[] noA(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            if (arr[i].startsWith("a")) arr[i] = arr[i].replace(arr[i], "###");
        }
        return arr;
    }

    //Task7
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

    //Task8
    public static int countPrimes(int[] arr) {
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>1) {
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

    public static void main(String[] args) {
        System.out.println("\n-----------Task1----------\n");
        String str = "  Hello World     ";
        System.out.println(HomeworkR4.noSpace(str));

        System.out.println("\n-----------Task2----------\n");
        String str2 = "Tech Global";
        System.out.println(HomeworkR4.replaceFirstAndLast(str2));

        System.out.println("\n-----------Task3----------\n");
        String str3 = "Java  ";
        System.out.println(HomeworkR4.hasVowel(str3));

        System.out.println("\n-----------Task4----------\n");
        int DOB = 1900;
        HomeworkR4.checkAge(DOB);

        System.out.println("\n-----------Task5----------\n");
        int a = 15;
        int b = 20;
        int c = 30;
        System.out.println(HomeworkR4.averageOfEdges(a, b, c));

        System.out.println("\n-----------Task6----------\n");
        String[] t6 = {"java", "hello", "123", "xyz"};
        System.out.println(Arrays.toString(noA(t6)));

        System.out.println("\n-----------Task7----------\n");
        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(numbers)));

        System.out.println("\n-----------Task8----------\n");
        int[] t8 = {41, 53, 19, 47, 67};
        System.out.println(HomeworkR4.countPrimes(t8));
    }
}