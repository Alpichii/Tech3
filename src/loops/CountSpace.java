package loops;

import java.util.Scanner;

public class CountSpace {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a sentence
        Count how many spaces there are in the given sentence
        Count how many a-A or e-E there are in the given sentence
        Count how many vowels this sentence has a, e, i, o, u

        Example"
        Today was sunny when I woke up!     -> 6
        I had a coffee with cream this morning  -> 7
        I like Java     -> 2
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please say something");
        String s = scanner.nextLine().toLowerCase();

        int counter = 0;
        int counterA = 0;
        int counterE = 0;
        int countVowels = 0;

        for (int i = 0; i <= s.length()-1; i++) {
            if(s.charAt(i) == ' ') counter++;
            else if(s.charAt(i) == 'a') counterA++;
            else if(s.charAt(i) == 'e') counterE++;
            else if(s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') countVowels++;
        }

        countVowels += (counterA + counterE);

        System.out.println("There are " + counter + " spaces in this sentence");
        System.out.println("There are " + counterA + " a-A letters in this sentence");
        System.out.println("There are " + counterE + " e-E letters in this sentence");
        System.out.println("There are " + (counterE + counterA) + " a-A or e-E letters in this sentence");
        System.out.println("There are " + countVowels + " vowel letters in this sentence");
    }
}

