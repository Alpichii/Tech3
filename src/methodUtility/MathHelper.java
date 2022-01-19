package methodUtility;

public class MathHelper {

    //Create math helper methods here

    //method that takes 2 ints a and b and prints their sum ->
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void printSum(double a, double b) {
        System.out.println(a + b);
    }

    //method that takes 3 ints a, b, c and prints their sum ->
    public static void printSum(int a, int b, int c) {

        System.out.println(a + b + c);
    }
    // method that takes 2 double a and b and prints their product

    public static void printProduct(double a, double b) {
        System.out.println(a * b);
    }

    //method prints square of a number  - non-static
    public void printSquare(int a) {
        System.out.println(a * a);
    }

    public int getRemainder(int a, int b) {
        return a % b;
    }

    public short getRemainder(short a, short b) {
        return (short) (a % b);
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(double a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }





}



