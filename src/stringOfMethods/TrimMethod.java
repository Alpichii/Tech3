package stringOfMethods;

public class TrimMethod {
    public static void main(String[] args) {
       /*
        -trim() is used to delete before and after white spaces
        -if there is not spaces before and after the text, then nothing will happen, no error
        -it will not touch spaces between the words
        -it is non-static method
        -it is a return type method and it returns the trimmed string back
         */

        String s1 = "Hello World   ";
        String s2 = "  I like Java    ";
        String s3 = "Today is Saturday";

        System.out.println("s1 before trim = " + s1);
        System.out.println("s1 length before trim = " + s1.length());
        System.out.println("s1 trimmed = " + s1.trim());
        System.out.println("s1 trimmed length = " + s1.trim().length()); //


        System.out.println(s2.trim());
        System.out.println(s3.trim());



    }
}
