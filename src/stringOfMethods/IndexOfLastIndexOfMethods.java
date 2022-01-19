package stringOfMethods;

public class IndexOfLastIndexOfMethods {
    public static void main(String[] args) {
        /*
        -indexOf() and lastIndexOf() methods are just other way of charAt() method
        -With these, we can give characters or strings as arguments and find their index
        -they are non-static
        -they are return type, and they return int
        -these methods are taking char or String as arguments but only 1 argument

        NOTE: if you give an argument that is not found in the String, then the method will return -1
        NOTE: These are overloaded methods
         */

        String twister = "Can you can a can as a canner can can a can?";

        int indexOfLowerCaseC = twister.indexOf('c'); // 8
        int indexOfUpperCaseC = twister.indexOf("C"); // 0
        int lastIndexOfLowerCaseA = twister.lastIndexOf('a'); // 41
        int lastIndexOfLowerCaseC = twister.lastIndexOf('c'); // 40

        System.out.println(indexOfLowerCaseC);
        System.out.println(indexOfUpperCaseC);
        System.out.println(lastIndexOfLowerCaseA);
        System.out.println(lastIndexOfLowerCaseC);

        System.out.println("\n-----------index with String arguments----------\n");
        System.out.println(twister.indexOf("can")); // 8
        System.out.println(twister.lastIndexOf("can")); // 40

        System.out.println(twister.indexOf("&")); // -1 as there is no & character in the String
    }
}