package stringOfMethods;

public class EqualsMethods {
    public static void main(String[] args) {



        /*
        -equals() or equalsIgnoreCase() methods are used to compare 2 strings with each other
        -the difference between these 2 methods, equalsIgnoreCase() will return true if letters are
        same ignoring lowercase or uppercase. On the other hand, equals() looks for exact match
        -both of them are non-static
        -both of them are returning boolean, you can store it in a boolean
        -both of them accept one argument to be compared with object that is calling method
        -DO NOT EVER COMPARE STRINGS WITH == OPERATOR
         */

        String s1 = "John";
        String s2 = "John";
        String s3 = "JOHN";

        boolean b1 = s1.equals(s2); //true
        boolean b2 = s2.equals(s3); //false
        boolean b3 = s3.equals(s1); //false
        boolean b4 = s1.equalsIgnoreCase(s3); // true

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}