package casting;

public class CastingCharacters {
    public static void main(String[] args) {
        char c1 = 'A';
        int i1 = c1;
        System.out.println(i1); //implicit casting

        int i2 = 122;
        char c2 = (char)i2;
        System.out.println(c2);

/*
find the sum of decimal representation of letters hello
 */
        System.out.println((int)'h' + (int)'e' + (int)'l' + (int) 'l' + (int) 'o');
    }
}
