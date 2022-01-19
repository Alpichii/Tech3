package stringOfMethods;

import java.util.Locale;

public class UpperCaseLowerCaseMethods {
    public static void main(String[] args) {

        /*
        -toLowerCase() and toUpperCase() methods are used to convert texts to
        all uppercase or lowercase letters
        -they are non-static methods - we called with object names
        -they return String
        -They don't take any arguments
         */

        String s1 = "TeCh";
        String s2 = "Global";
        String s3 = "School";

        String s4 = s1.toLowerCase();
        System.out.println(s4); // tech

        System.out.println(s2.toLowerCase()); // global
        System.out.println(s3.toUpperCase()); // SCHOOL

        String s5 = "Hello World";

        System.out.println(s5.toLowerCase().toUpperCase()); // HELLO WORLD
    }
}
