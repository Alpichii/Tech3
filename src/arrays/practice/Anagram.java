package arrays.practice;

import java.util.Arrays;

public class Anagram {

    /*
    Write a method (public static) that takes 2 Strings and returns boolean
    Method name is isAnagram()
    This method will return true if the given strings are anagrag
    Return false otherwise

    EXAMPLE
    listen silent
    race care
    fried fired
     */

    public static boolean isAnagram(String s1, String s2){
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        Arrays.sort(s1chars);
        Arrays.sort(s2chars);

        return Arrays.equals(s1chars, s2chars);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen")); // true
        System.out.println(isAnagram("hello", "world")); // false
        System.out.println(isAnagram("race", "care")); // true
        System.out.println(isAnagram("pillow", "blanket")); // false
    }
}


