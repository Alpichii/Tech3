package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {
    //Task1
    public static int countWords(String str) {
        str = str.trim();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    //Task2
    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a')
                count++;
        }
        return count;
    }

    //Task3
    public static int countPos(ArrayList<Integer> args) {

        int countPos = 0;
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) > 0) countPos++;
        }
        return countPos;
    }

    //Task4
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> args) {
        ArrayList<Integer> empty = new ArrayList<>();

        for (int i = 0; i < args.size(); i++) {
            if (!empty.contains(args.get(i))) {
                empty.add(args.get(i));
            }
        }
        return empty;
    }

    //Task5
    public static ArrayList<String> removeDuplicatesElements(ArrayList<String> args) {
        ArrayList<String> empty = new ArrayList<>();
        for (int i = 0; i < args.size(); i++) {
            if (!empty.contains(args.get(i))) {
                empty.add(args.get(i));
            }
        }
        return empty;
    }

    //Task6
    public static String removeExtraSpaces(String str) {
        str = str.trim();
        String empty = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ')
                empty += str.charAt(i);
        }
        return empty;
    }

    //Task7 with Salih!
    public static int[] add(int[] arr1, int[] arr2) {


        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if (arr1.length > arr2.length) {
                arr1[i] = arr1[i] + arr2[i];
            } else {
                arr2[i] = arr1[i] + arr2[i];
            }
        }
        if (arr1.length > arr2.length) {
            return arr1;
        }
        return arr2;
    }

    //Task8 with Salih!
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

    public static void main(String[] args) {
        System.out.println("\n--------------Task1------------\n");
        String str = "      Java is fun       ";
        System.out.println(Homework11.countWords(str));

        System.out.println("\n--------------Task2------------\n");
        String str1 = "TechGlobal is a QA bootcamp";
        System.out.println(Homework11.countA(str1));

        System.out.println("\n--------------Task3------------\n");
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(Homework11.countPos(arr));

        System.out.println("\n--------------Task4------------\n");
        ArrayList<Integer> t4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(Homework11.removeDuplicates(t4));

        ArrayList<String> elements = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(Homework11.removeDuplicatesElements(elements));

        System.out.println("\n--------------Task6------------\n");
        String str6 = "   I   am      learning     Java      ";
        System.out.println(Homework11.removeExtraSpaces(str6));

        System.out.println("\n--------------Task7------------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("\n--------------Task8------------\n");
        int[] numbers = {10, -13, 15, 70, 5, 57};
        System.out.println(findClosestTo10(numbers));
    }


}



