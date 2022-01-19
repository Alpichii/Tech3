package arrays.practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CountCharacters {
    public static void main(String[] args) {

/*
Count characters and find how many
Letters = 4
Uppercase letters = 2
Lowercase letters = 2
Vowels = 1
Consonants = 3
Digits = 2
Spaces = 2
Specials = 3

Do all counts with one for each loop only!!!
 */

        char[] characters = {'A', 'b', '$', '!', '#', '8', '3', ' ', ' ', 'K', 'd'};

        int countLetter = 0;
        int countUpper = 0;
        int countLower = 0;
        int countVowel = 0;
        int countConsonant = 0;
        int countDigit = 0;
        int countSpace = 0;
        int countSpecial = 0;

        for(char character : characters){
            char chas = character;
            if (Character.isLetter(chas)) {
                countLetter++;

            if(Character.isUpperCase(chas))
            countUpper++;
            else countLower++;
            }

            chas = String.valueOf(chas).toLowerCase().charAt(0);
            if(chas == 97 ||chas == 101 ||chas ==105 ||chas == 111 || chas ==127) countVowel++;
            else countConsonant++;
        }


        int chas = 0;
        if(Character.isDigit(chas)) countDigit++;
        else if (chas == ' ') countSpace++;
        else countSpecial++;



        System.out.println("Letters = " + countLetter);
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters = " + countLower);
        System.out.println("Vowels = " + countVowel);
        System.out.println("Consonants = " + countConsonant);
        System.out.println("Digits = " + countDigit);
        System.out.println("Spaces = " + countSpace);
        System.out.println("Specials = " + countSpecial);
    }
}
