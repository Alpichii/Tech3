package mathClassMethods;

public class FindAbsoluteNumbers {
    public static void main(String[] args) {
        /*
        Math.abs() method always returns positive value of given number
        this method takes ONLY 1 argument (number)
        When we need to measure distance, we will use this method
         */

        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10 - 54)); // most common way to use it
        System.out.println(Math.abs(3 * 15 - 20 / 4 + 13));

        System.out.println(Math.abs(5 - 10));
        System.out.println(Math.abs(10 - 5));
    }
}
