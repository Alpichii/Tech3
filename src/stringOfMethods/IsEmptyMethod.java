package stringOfMethods;

public class IsEmptyMethod {
    public static void main(String[] args) {
        /*
        -This method is used to check if a String is empty or not
        -it is a non-static method
        -it is a return type method and returns a boolean
        -it does not take any argument
         */

                String s1 = "";
                String s2 = "Hello";

                System.out.println(s1.isEmpty()); // true
                System.out.println(s2.isEmpty()); // false
    }
}
