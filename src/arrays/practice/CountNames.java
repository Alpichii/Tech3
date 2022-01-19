package arrays.practice;

import java.util.Arrays;

public class CountNames {
    public static void main(String[] args) {
        /*

         /*
        TASK-1
        Create a String array to store below names
        "Alex", "Alper", "Burak", "Olha", "Jafeth", "Jessie", "Olly", "Jennifer"

        And print the array
         */

        System.out.println("\n-----------TASK-1----------\n");
        String[] names = {"alex", "Olha", "Burak", "Isabella", "jafeth", "Jessie", "ellie", "Jennifer"};

        System.out.println("My names array is = " + Arrays.toString(names));


        /*
        TASK-2
        Print each name with below message using for each loop
        Name is = Alex
        .
        .
        .
        Name is = Jennifer
         */

        System.out.println("\n-----------TASK-2----------\n");
        for (String name : names) {
            System.out.println("Name is = " + name);
        }


        /*
        TASK-3
        Count all the names that starts with J or j
        And print the result with below message

        EXPECTED OUTPUT:
        There are 3 names starting with J or j
         */

        System.out.println("\n-----------TASK-3 | 1st way----------\n");

        int jCounter = 0;
        for (String name : names) {
            if (name.toLowerCase().startsWith("j")) jCounter++;
        }

        System.out.println("There are " + jCounter + " names starting with J or j");

        System.out.println("\n-----------TASK-3 | 2nd way----------\n");

        jCounter = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toUpperCase().startsWith("J")) jCounter++;
        }
        System.out.println("There are " + jCounter + " names starting with J or j");

        System.out.println("\n-----------TASK-4 ----------\n");
        /*
        TASK-4
        Count all the names that has at least 5 characters
        And print the result with below message

        EXPECTED OUTPUT:
        There are 5 names having at least 5 characters
        */


        int countLength5 = 0;
        for (String name : names) {
            if (name.length() >= 5) countLength5++;
        }
        System.out.println("There are " + countLength5 + " names having at least 5 characters");

        System.out.println("\n-----------TASK-5 ----------\n");
        /*
        TASK-5
        Count all the names that starts with a vowel letter
        And print the result with below message

        EXPECTED OUTPUT:
        There are 4 names starting with a vowel letter
        */
        System.out.println();
        int countNameStringWithVowel = 0;
        for (String name : names){
         name = name.toLowerCase();
         if(name.startsWith("a") || name.startsWith("e") || name.startsWith("i") || name.startsWith("o") ||
                 name.startsWith("u")) countNameStringWithVowel++;
         }
        System.out.println("There are " + countNameStringWithVowel + " names starting with a vowel letter");



        System.out.println("\n-----------TASK-6 ----------\n");

        int lowerCounter = 0;
        int upperCounter = 0;
        for (String name : names){
            if(Character.isLowerCase(name.charAt(0))) lowerCounter++;
            else upperCounter++;
        }
        System.out.println("There are " + lowerCounter + " names starting with a lowercase letter");
        System.out.println("There are " + upperCounter + " names starting with a uppercase letter");















        /*
        TASK-6
        Count all the names that starts lowercase and uppercase letters separately
        And print the result with below message
        Hint: Character class

        EXPECTED OUTPUT:
        There are 3 names starting with a lowercase letter
        There are 5 names starting with an uppercase letter
         */



    }
}
