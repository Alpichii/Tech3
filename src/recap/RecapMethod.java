package recap;

public class RecapMethod {

    public static boolean isEven(int n) {
        if (n % 2 != 0) return false;
        else return true;
    }

    public static boolean startsWithA(String word) {
        return word.toLowerCase().startsWith("a");

        /*
        if (word.toLowerCase().startsWith("a")) return true;
        else return false;
        */
    }

    public static void main(String[] args) {

        System.out.println(isEven(10)); // true
        System.out.println(isEven(-5)); // false
        System.out.println(isEven(0)); // true
        System.out.println(isEven(3)); // false

        System.out.println(startsWithA("Alper"));
        System.out.println();
    }
}
