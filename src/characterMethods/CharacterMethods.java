package characterMethods;

import methodUtility.CharChecker;

public class CharacterMethods {
    public static void main(String[] args) {


        /*
        isWhitespace(char c);
        it is public - private default protected - access  modifier
        -it is static
        -it is return type method
        -it returns boolean - what variable type I can store it
        -it takes one argument, and it is char

        If Method is return type, you can see result if you print the result
        Also , whatever result that it returns can be stored in a proper variable
         */
        char c1 = '#';
        boolean isSpace = Character.isWhitespace(c1);
        System.out.println(isSpace);
        /*
        -it is public
        -it is static
        - it is return type and returns boolean
        -it takes one argument, and it is char
         */

        char c2 = 'j';

        boolean isLetter = Character.isLetter(c2);
        boolean isUpperCase = Character.isUpperCase(c2);
        boolean isLowercase = Character.isLowerCase(c2);
        System.out.println("is j letter = " + isLetter);
        System.out.println("is j letter = " + isUpperCase);
        System.out.println("is j letter = " + isLowercase);

        char c3 = '7';

        boolean isDigit = Character.isDigit(c3);
        boolean isDigitOrLetter = Character.isLetterOrDigit(c3);
        boolean is7Space = Character.isSpaceChar(c3);
        System.out.println("is 7 digit = " + isDigit);
        System.out.println("is 7 digit = " + isDigitOrLetter);
        System.out.println("is 7 digit = " + is7Space);

        char c4 = '&';
        boolean isSpecial = CharChecker.isSpecialCharacter(c4);
        System.out.println("is & special = " + isSpecial);

        /*
        Write a program that asks user to enter their name and print
        true if name starts with A or a
        print false otherwise
         */




    }
}
