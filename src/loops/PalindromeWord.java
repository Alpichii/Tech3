package loops;

import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        /*
        Write a program to ask user to enter a word
        Print true if the word is palindrome
        Print false otherwise

        Palindrome word examples:
        civic, level

        NOTE: Ignore case
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String s = scanner.next();

        String sReversed = "";

        for (int i = s.length()-1; i >= 0; i--) {
            sReversed += s.charAt(i);
        }
        System.out.println(s.equalsIgnoreCase(sReversed));

    }
}