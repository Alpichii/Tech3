package homeworks;

import java.util.Arrays;

public class HomeworkR5 {
    //Task1
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    /*
     String temp = "";
     for (int i = 0; i < str.length(); i++) {
         if (!Character.isDigit(str.charAt(i))) temp += str.charAt(i);
     }
     return temp;
 }

 String temp = "";
 for (int i = 0; i < s1.length(); i++) {
     if(!Character.isDigit(s1.charAt(i))) temp += s1.charAt(i);
 }
 return temp;
 }
  */
    //Task2
    public static String noVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //Task3
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    //Task4
    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    //Task5
    public static int middleInt(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[1];
        /*
        if(a == b && b == c) return a;
        else if(a == b || b == c) return b;
        else if (a == c) return a;

        if ((a < b && b < c) || (c < b && b < a)) return b;
        else if ((b < a && a < c) || (c < a && a < b)) return a;
        else return c
         */
    }

    //Task6
    public static int[] no13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    //Task7  recap salih
    public static int[] arrFactorial(int[] arr) {
        int[] factArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int currentFact = 1;
            for (int j = arr[i]; j > 1; j--) {
                currentFact *= j; // 24
            }
            factArr[i] = currentFact;
        }
        return factArr;
    }

    //Task8  recap salih
    public static String[] categorizeCharacters(String str) {
        String[] c = {"", "", ""};

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                c[0] += str.charAt(i) + "";
            } else if (Character.isDigit(str.charAt(i))) {
                c[1] += str.charAt(i) + "";
            } else if (!Character.isWhitespace(str.charAt(i))) {
                c[2] += str.charAt(i) + "";
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("\n==========Task1==========\n");
        String t1 = "123Tech456Global149";
        System.out.println(noDigit(t1));

        System.out.println("\n==========Task2==========\n");
        String t2 = "TechGlobal";
        System.out.println(noVowel(t2));

        System.out.println("\n==========Task3==========\n");
        String t3 = "";
        System.out.println(sumOfDigits(t3));

        System.out.println("\n==========Task4==========\n");
        String t4 = "John's age is 29";
        System.out.println(hasUpperCase(t4));

        System.out.println("\n==========Task5==========\n");
        System.out.println(middleInt(10, 10, 25));

        System.out.println("\n==========Task6==========\n");
        int[] t6 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(no13(t6)));

        System.out.println("\n==========Task7==========\n");
        int[] t7 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(t7)));

        System.out.println("\n==========Task8==========\n");
        String t8 = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(t8)));
    }
}