package practice;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        /*
        TASK-1
        Assume that you are given a String as below

        String s1 = "Most common programming languages are Java, Ruby, Python and JavaScript";

        Convert all String to lower case first
        Print length of the string
        Print first index of the java
        Print the last index of the java
        Print the index of the python
         */

        String s1 = "Most common programming languages are Java, Ruby, Python and JavaScript";
        s1 = s1.toLowerCase();

        System.out.println(s1.length());
        System.out.println(s1.indexOf("java"));
        System.out.println(s1.lastIndexOf("java"));
        System.out.println(s1.indexOf("python"));

        System.out.println(s1.indexOf("common"));
        System.out.println(s1.lastIndexOf("common"));


        /*
        TASK-2
        Assume that you are given below String

        String s2 = "    Good Morning!    ";

        Write a program to find first char that is not space in this string
        Write a program to find last char that is not space in this string
         */

        String s2 = "    Good Morning!    ";
        s2 = s2.trim();

        System.out.println(s2.charAt(0));
        System.out.println(s2.substring(0,1));
        System.out.println(s2.charAt(s2.length()-1));
        System.out.println(s2.substring(s2.length()-1));


        /*
        TASK-3
        Assume that you are given 3 strings as below
        String str1 = "SKY";
        String str2 = "deck";
        String str3 = "toWER";

        Create a new string called str4 that will concatenate all 3 strings above and will print result as below
        SkyDeck Tower
         */

        String str1 = "SKY";
        String str2 = "deck";
        String str3 = "toWER";

        String str4 = (str1 + str2 + " " + str3).toLowerCase().replace('s', 'S')
                .replace('d', 'D').replace('t', 'T');

        System.out.println(str4);



        /*
        TASK-4
        Write a program to ask user to enter a long sentence that has at least 4 words
        And print second word and the second word from the last

        EXAMPLE:
        I like programming language Java

        like programming language

        EXPECTED OUTPUT
        like
        language
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence that has at least 4 words");
        String s = scanner.nextLine();

        s = s.replace(s.substring(0, s.indexOf(' ')), "").replace(s.substring(s.lastIndexOf(' ')+1), "").trim();

        System.out.println(s.substring(0, s.indexOf(' ')));
        System.out.println(s.substring(s.lastIndexOf(' ')+1));


        /*
        TASK-5
        Ask user to enter a sentence
        And check if sentence contains "red" and "abc"
        if it contains both, print "Double match"
        if it contains either, print "Single match"
        Otherwise, print "No match"

        NOTE: Ignore case
         */

        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine().toLowerCase();

        if(sentence.contains("red") && sentence.contains("abc")) System.out.println("Double Match");
        else if(sentence.contains("red") || sentence.contains("abc")) System.out.println("Single match");
        else System.out.println("No match");
    }
}