package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n----------Task1----------\n");

        String str = "$# aBC 1230gH <)g7";

        int spaceCounter = 0;
        int letterCounter = 0;
        int digitCounter = 0;
        int specialCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) spaceCounter++;
        }

        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) letterCounter++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) digitCounter++;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) specialCounter++;
        }
        System.out.println("The total number of spaces: " + spaceCounter);
        System.out.println("The total number of letters: " + letterCounter);
        System.out.println("The total number of digits: " + digitCounter);
        System.out.println("The total number of specials " + specialCounter);

        System.out.println("\n----------Task2----------\n");

        String str2 = "Hi! How are you?";

        int countVowels = 0;
        int countLetter = 0;

        for (int i = 0; i <= str2.length() - 1; i++) {
            char c2 = str2.toLowerCase().charAt(i);
            if (Character.isLetter(c2)) {
                if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') countVowels++;
                else countLetter++;
            }
        }
        System.out.println("The total number of vowels: " + countVowels);
        System.out.println("The total number of letters: " + countLetter);

        System.out.println("\n----------Task3----------\n");

        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n----------Task4----------\n");

        String str4 = "aPple";
        str4 = str4.toLowerCase();
        str4 = str4.trim();
        int flag = 0;
        for (int i = 0; i < str4.length() - 1; i++) {
            flag = 0;
            for (int j = i + 1; j < str4.length(); j++) {

                if (str4.charAt(i) == str4.charAt(j)) flag++;
            }
            if (flag > 0) System.out.println(str4.charAt(i));
        }

        System.out.println("\n----------Task5----------\n");

        int[] numbers5 = {-5, 0, 6, 98, -7, 0, -56, 34, 10};

        int countPositives = 0;
        int countNegatives = 0;
        int countZeros = 0;

        for (int j : numbers5) {

            if (j > 0) countPositives++;
            else if (j < 0) countNegatives++;
            if (j == 0) countZeros++;
        }
        System.out.println("The total occurrences of negatives:" + countNegatives);
        System.out.println("The total occurrences of positives: " + countPositives);
        System.out.println("The total occurrences of zeros: " + countZeros);

        System.out.println("\n----------Task6----------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        int firstPos = 0;
        int firstNeg = 0;

        for (int num : numbers) {
            if (num > 0 && firstPos == 0) {
                firstPos = num;
            }
            if (num < 0 && firstNeg == 0) {
                firstNeg = num;
            }
        }
        System.out.println(firstNeg);
        System.out.println(firstPos);

        System.out.println("\n----------Task7----------\n");

        int r1 = (int) (Math.random() * 9) + 2; //0,1,2,3,4,5,6,7,8
        int r2 = (int) (Math.random() * 9) + 2;// 2,3,4,5,6,7,8,9,10-not included
        int r3 = (int) (Math.random() * 9) + 2;
        int r4 = (int) (Math.random() * 9) + 2;
        int r5 = (int) (Math.random() * 9) + 2;
        int[] nums7 = {r1, r2, r3, r4, r5};
        int flagNum7 = 0;
        for (int numbrs7 : nums7) {
            if ((numbrs7 == 2 || numbrs7 == 3)) {
                flagNum7++;
                System.out.println(true);
                break;
            }
        }
        if (flagNum7 < 1) System.out.println(false);

        System.out.println("\n----------Task8----------\n");

        String[] list = {"banana", "orange", "Apple"};

        Arrays.sort(list);
        System.out.println(Arrays.binarySearch(list, "apple") >= 0);


        System.out.println("\n----------Task9----------\n");

        int[] numbers9 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        int nums9Flag = 0;

        //Arrays.toString(numbers9);

        String container = "";

        for (int i = 0; i < numbers9.length - 1; i++) {
            if (container.contains(String.valueOf(numbers9[i]))) {
                continue;
            }

            for (int j = i + 1; j < numbers9.length; j++) {
                if (container.contains(String.valueOf(numbers9[i]))) {
                    continue;
                }

                if (numbers9[i] == numbers9[j]) {
                    nums9Flag++;
                    container += String.valueOf(numbers9[i]);
                    System.out.println(numbers9[i]);
                }
            }
        }
        if (nums9Flag <= 0) System.out.println("There is no duplicate");

        System.out.println("\n----------Task10----------\n");

        String[] words = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    if (!duplicates.contains(words[i])) {
                        duplicates.add(words[i]);
                        duplicates.add(words[j]);
                    }
                    break;
                }
            }
            System.out.println(duplicates);
        }

        System.out.println("\n----------Task11----------\n");

        int[] numbers11 = {0, -4, -7, 0, 5, 10, 45, 45};
        Arrays.sort(numbers11);
        int flag11 = 0;
        for (int i = 0; i < numbers11.length - 1; i++) {

            if (numbers11[i] == numbers11[i + 1] && flag11 <= 0) {
                flag11++;
                System.out.println(numbers11[i + 1]);
            }
        }

        System.out.println("\n----------Task12----------\n");

        String[] words12 = {"Z", "abc", "z", "123", "#"};
        int words12Flag = 0;
        for (int i12 = 0; i12 < words12.length - 1; i12++) {

            for (int j12 = i12 + 1; j12 < words12.length; j12++) {

                if (words12[i12].equalsIgnoreCase(words12[j12]) && words12Flag < 1) {
                    words12Flag++;
                    System.out.println(words12[i12]);
                }
            }
        }
        if (words12Flag <= 0) System.out.println("No duplicates");

        System.out.println("\n----------Task13----------\n");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean flag13 = false;
        for (int i13 : numbers1) {
            for (int j13 : numbers2) {
                if (i13 == j13) {
                    flag13 = true;
                    System.out.println(i13);
                    break;
                }
            }
        }
        if (!flag13) System.out.println("There is no matching elements");

        System.out.println("\n----------Task14----------\n");
        int[] number14 = {10, 20, 30, 50, 70};

        int[] numbers14Reversed = new int[number14.length];

        for (int i14 = 0; i14 <= number14.length / 2; i14++) {
            numbers14Reversed[i14] = number14[number14.length - 1 - i14];
            numbers14Reversed[number14.length - 1 - i14] = number14[i14];
        }

        System.out.println(Arrays.toString(numbers14Reversed));

        System.out.println("\n----------Task15----------\n");

        String str15 = "Java is fun";
        str15 = str15.trim();
        String[] str15Array = str15.split(" ");

        for (String element15 : str15Array) {

            for (int i15 = element15.length() - 1; i15 >= 0; i15--) {
                System.out.print(element15.charAt(i15));
            }
            if (element15 != str15Array[str15Array.length - 1]) System.out.print(" ");
        }
    }
}
