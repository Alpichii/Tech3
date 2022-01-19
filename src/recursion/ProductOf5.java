package recursion;

public class ProductOf5 {
    public static int factorial(int args) {

        if (args > 0) return args * factorial(args - 1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
       



}
