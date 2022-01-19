package mathClassMethods;

public class FindMax {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(Math.max(a, b));
        System.out.println("The max number between " + a + " and " + b + " max is " + Math.max(a, b));

        //Find the max of 8 numbers 5, 10, 67, -12, 8, 3, 0, 100
        int max = Math.max(Math.max(Math.max(5, 10), Math.max(67, -12)), Math.max(Math.max(8, 3), Math.max(0, 100)));
        System.out.println("The max of these 8 numbers = " + max);

        //Find the max of 3 numbers 3, 5, 11
        int maxOfThree = Math.max(Math.max(3, 5), 11);
        System.out.println("The max of 3 numbers = " + maxOfThree);




    }
}
