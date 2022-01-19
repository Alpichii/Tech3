package stringOfMethods;

import java.util.Scanner;

public class ConcatMethod {
    public static void main(String[] args) {
        /*
        -concat() method is used to combine strings together and form a new string
        -it is not as useful as concatenation with plus (+) operator
        -it is a non-static method -  you can call it with object.
         */

        String s1 = "Tech";
        String s2 = "Global";
        String s3 = "School";
        String s4 = s1.concat(s2).concat(" ").concat(s3);   // not a common in market but you can

        System.out.println(s4);
        System.out.println(s1 + s2 + " " + s3);

    }

    public static class NameChecker {
        public static void main(String[] args) {
            System.out.println("\n------------------TASK-1--------------------\n");
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your name");
            String name = input.nextLine();

            System.out.println("The name is = " + name);

            System.out.println("\n------------------TASK-2--------------------\n");

            int nameLength = name.length();
            System.out.println("The length of the " + name + " is = " + nameLength);

            System.out.println("\n------------------TASK-3--------------------\n");       /*
            Print the first and last letter of the name

            Expected result:
            First letter of the name = {firstLetter}
            Last letter of the name = {lastLetter}

            Examples
            John -> J n
            Alex -> A x
            Feyza -> F a
                    */

            System.out.println("\n------------------TASK-4--------------------\n");
            if (!name.isEmpty()) {
                char firstLetter = name.charAt(0);
                char lastLetter = name.charAt(name.length() - 1);

                System.out.println("First letter of the name = " + firstLetter);
                System.out.println("Last letter of the name = " + lastLetter);
            } else {
                System.out.println("The name is not provided");
            }
            System.out.println("\n------------------TASK-5--------------------\n");
            /*
            TASK-4
            Print first 5 letters of the name
            Print last 5 letters of the name

            EXAMPLES
            Alex     -> NOT FOUND
            Jennifer -> Jenni   nifer
            Mariam   -> Maria   ariam

            Expected result
            if name is more than 4 letters -> First 5 letters = {first5}
                                           -> Last 5 letters = {last5}
            else                           -> NOT FOUND
             */

            if (name.length() >= 5 & name.startsWith("A") || name.startsWith("a")) {
                String first5 = name.substring(0, 5);
                System.out.println("first 5 letters = " + first5);

                String last5 = name.substring(name.length() - 5);
                System.out.println("Last 5 letters = " + last5);

            } else {
                System.out.println("");
            }
        }
    }

    public static class SentenceWork {
        public static void main(String[] args) {
            /*
            TASK-1
            Write a program that asks user to enter a sentence
            Store sentence in a String
            Print it with message "Sentence is = {sentence}"
             */

            System.out.println("\n---------------TASK-1-----------------\n");
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a sentence");

            String sentence = input.nextLine();
            System.out.println("Sentence is = " + sentence);

            /*
            TASK-2
            Check if sentence contains apple ignoring case APple 32
            Print true if it contains apple
            Print false otherwise
             */
            System.out.println("\n---------------TASK-2-----------------\n");
            System.out.println(sentence.toUpperCase().contains("APPLE"));

            /*
            TASK-3
            Check if sentence contains both blue and red keyword anywhere in the String
            Ignore cases
            if it contains both print true
            else print false
             */
            System.out.println("\n---------------TASK-3-----------------\n");
            System.out.println(sentence.toLowerCase().contains("red") && sentence.toLowerCase().contains("blue"));

            /*
            TASK-4
            Print first and last words of the sentence
             */
            System.out.println("\n---------------TASK-4-----------------\n");
            System.out.println("First word = " + sentence.substring(0, sentence.indexOf(' ')));
            System.out.println("Last word = " + sentence.substring(sentence.lastIndexOf(' ') + 1));

        }
    }
}
