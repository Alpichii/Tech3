package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeworkR6SolutionWithSalih {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String[] arr = {"xyXyxy", "Xx", "ABC"};
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Question-3");
        System.out.println(Arrays.deepToString(numberAndSquare(numbers)));

        System.out.println("Question-5");
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("Question-9");
        System.out.println(noXInVariables(arrList));
    }

    public static int[][] numberAndSquare(int[] numbers){
        int[][] numbersSquared = new int[numbers.length][2];

        for (int i = 0; i < numbers.length; i++) {
            numbersSquared[i][0] = numbers[i];
            numbersSquared[i][1] = numbers[i] * numbers[i];
        }

        return numbersSquared;
    }

    public static String reverseSentence(String sentence){
        if (!sentence.trim().contains(" ")) return "There is not enough words!";

        //“Java is fun” -> "“fun is java”
        String reversedSentence = "";
        String[] sentenceArray = sentence.split(" ");

        for (int i = sentenceArray.length - 1; i >= 0 ; i--) {
            reversedSentence += sentenceArray[i].toLowerCase() + " ";
        }

        return Character.toUpperCase(reversedSentence.charAt(0)) + reversedSentence.substring(1).trim();
    }

    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        ArrayList<String> newArr = new ArrayList<>();

        for (String s : arr) {
            String newStr = s.replaceAll("x", "").replaceAll("X", "");
            if(newStr.length() != 0) newArr.add(newStr);
        }

        return newArr;
    }
}