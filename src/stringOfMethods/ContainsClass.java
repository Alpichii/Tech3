package stringOfMethods;

public class ContainsClass {
    public static void main(String[] args) {
        /*
        String colors = "Yellow, blue, red, purple, tomato";


         */

        String value = "i like playing soccer and reading books";
        System.out.println(value.substring(value.indexOf("books")));
        boolean containsSoccer = value.contains("soccer");
        boolean containsBooks = value.contains("books");
        boolean b3 = value.contains("playing") && value.contains("reading");

        System.out.println(value.contains("soccer"));
        System.out.println(value.contains("books"));
        System.out.println(value.contains("playing") && value.contains("reading"));
    }
}
