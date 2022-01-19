package arrays.practice;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {
        String s = "We are learning more methods about arrays today";

        System.out.println("\n-----------Counting words in a String way 1------------\n");
        int countSpace1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') countSpace1++;
        }

        System.out.println("There are " + countSpace1 + " spaces in this sentence");
        System.out.println("There are " + (countSpace1+1) + " words in this sentence");

        System.out.println("\n-----------Counting words in a String way 2------------\n");
        char[] allCharacters = s.toCharArray();
        System.out.println(Arrays.toString(allCharacters));

        int countSpace2 = 0;
        for (char c : allCharacters) {
            if(Character.isWhitespace(c)) countSpace2++;
        }

        System.out.println("There are " + countSpace2 + " spaces in this sentence");
        System.out.println("There are " + (countSpace2+1) + " words in this sentence");


        System.out.println("\n-----------Counting words in a String way 3------------\n");

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("There are " + words.length + " words in this sentence");

        //Reverse each word
        String allReversed = "";

        for (String word : words) {
            for (int i = word.length()-1; i >= 0; i--) {
                allReversed += word.charAt(i);
            }
            allReversed += " ";
        }

        System.out.println(allReversed.trim());
    }
}
