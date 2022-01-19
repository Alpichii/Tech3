package stringOfMethods;

public class SubstringMethods {
    public static void main(String[] args) {
        /*
        -it is non-static
        -they are return type and return string
         */
        /*
         */
        /*
        Create new strings to store below substrings and print them
        Tech
        Global
        Glo
        bal
        ch
         */

        String s = "TechGlobal";

        System.out.println(s.substring(0,4));
        System.out.println(s.substring(4));
        System.out.println(s.substring(4,7));
        System.out.println(s.substring(7));
        System.out.println(s.substring(2,4));

        String str = "Software Testing";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(4,8));
        System.out.println(str.substring(9));
        System.out.println(str.substring(9, 13));
        System.out.println(str.substring(13,16));


    }
}
