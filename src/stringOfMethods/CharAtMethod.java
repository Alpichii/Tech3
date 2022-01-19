package stringOfMethods;

public class CharAtMethod {
    public static void main(String[] args) {
        /*
        -charAt() method is used to get a char from String in a specific index (position)
        -it is a non-static method - call it with object
        -it returns a char, so we can store it in a char variable
        -it takes an int as an argument and returns the char at this index
        NOTE: index always starts from zero
        NOTE: if you try to get a char out of bound, you will get StringIndexOutOfBoundsException
         */

        String greeting = "Good morning";

        char firstChar = greeting.charAt(0); // G
        char fourthChar = greeting.charAt(4); // space 32
        char eightChar = greeting.charAt(8); // n
        char lastChar = greeting.charAt(11); // g

        System.out.println(firstChar);
        System.out.println(fourthChar);
        System.out.println(eightChar);
        System.out.println(lastChar);

        System.out.println(greeting.charAt(15)); // This will throw StringIndexOutOfBoundsException

    }
}

