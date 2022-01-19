package stringOfMethods;

public class ValueOfMethods {
    public static void main(String[] args) {
        /*
        valueOf() Method is used to convert primitives and some others
        -it is a static method - can be called with class name String.valueOf()
        -it is also a return type method and returns String
        - it takes argument and this argument is usually primitives , they are converted to Strings
        - it is also overloaded method-
         */

        int number = 12345;
        String numberToText = String.valueOf(number);
        System.out.println(numberToText);
    }
}
