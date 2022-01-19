package arrayList.practice;

import java.util.LinkedList;

public class CountWords2 {
    public static void main(String[] args) {
        /*
         TASK-1
         Create a list to store given data below
         Java
         Ruby
         Kotlin
         Python
         JavaScript
         java
         Ruby

         Then, print list with message The languages list =
         Also, print the size of the list with message The size of the list =
         */

        System.out.println("\n---TASK-1---\n");
        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Ruby");
        languages.add("Kotlin");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("java");
        languages.add("Ruby");

        System.out.println("The languages list = " + languages);
        System.out.println("The size of the list = " + languages.size());

        /*
        TASK-2
        Count and print languages that does not start with J or j
        EXPECTED RESULT:
        Ruby
        Kotlin
        Python
        Ruby

        There are 4 elements does not start with J or j
         */

        System.out.println("\n---TASK-2---\n");

        int countJ = 0;
        for (String language : languages) {
            if(!language.toLowerCase().startsWith("j") ){
                System.out.println(language);
                countJ++;
            }
        }
        System.out.println("There are " + countJ + " elements starts with J");


         /*
        TASK-3
        Count and print languages that contains a

        EXPECTED RESULT:
        Java
        JavaScript
        java

        There are 3 elements contains a
         */

        System.out.println("\n---TASK-3---\n");
        int countA = 0;

        for (String s : languages) {
            if(s.contains("a")){
                countA++;
                System.out.println(s);
            }
        }
        System.out.println("There are " + countA + " elements contains a");

        /*
        BONUS-TASK
        Print each element but only with their first and last characters
        Ja
        Ry
        Kn
        Pn
        Jt
        ja
        Ry

        charAt(0)
        charAt(str.length()-1)
         */

        System.out.println("\n---BONUS TASK---\n");
        for (String language : languages) {
            System.out.println("" + language.charAt(0) + language.charAt(language.length()-1));
        }

    }
}