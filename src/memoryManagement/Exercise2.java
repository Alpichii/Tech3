package mutability;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        1.Create a String to store "banana"
        2.Convert it to StringBuffer
        3.Insert APPLE in the middle of banana -> banAPPLEana
        4.Insert 123 in front the APPLE and 321 at the end of APPLE ->ban123APPLE321ana
        4.Replace all lowercase letters with dash -> ---123APPLE321---
         */

        String s = "banana";
        StringBuffer sb = new StringBuffer(s);

        sb.insert(3, "APPLE");
        System.out.println(sb);

        sb.insert(8, "321");
        sb.insert(3, "123");
        System.out.println(sb);

        sb.replace(0,3, "---");
        sb.replace(sb.length()-3, sb.length(), "---");
        System.out.println(sb);
    }
}
