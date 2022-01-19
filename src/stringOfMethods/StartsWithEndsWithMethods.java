package stringOfMethods;

public class StartsWithEndsWithMethods {
    public static void main(String[] args) {
        /*
        -these methods check if String starts with or ends with another String
        -it is non-static method
        -it is return type and returns boolean
        -it takes one argument and the argument is always String

        NOTE: it does not take char as argument, do not try single quotation
         */

        String city = "Chicago";

        System.out.println(city.startsWith("")); // true

        boolean cityStartsWithA = city.startsWith("A"); // false

        System.out.println(cityStartsWithA);
        System.out.println(city.startsWith("c")); // false
        System.out.println(city.startsWith("C")); // true

        System.out.println(city.startsWith("Chi")); // true

        System.out.println("bilal".endsWith("lal")); // true

        System.out.println("javascript".startsWith("java") && "javascript".endsWith("t")); // true

        System.out.println(city.toLowerCase().startsWith("c")); // true
    }
}
