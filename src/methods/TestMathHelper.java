package methods;

import methodUtility.MathHelper;

public class TestMathHelper {
    public static void main(String[] args) {
        MathHelper.printSum(100, 75);
        MathHelper.printSum(25, 50);
        MathHelper.printSum(3, 5);

        MathHelper.printSum(10.5, 7.5);
        MathHelper.printSum(5, 8);


        MathHelper.printSum(5, 8, 10);
        MathHelper.printProduct(1.5, 2.5);

        MathHelper myHelper = new MathHelper();
        myHelper.printSquare(7);
        myHelper.printSquare(5);

        System.out.println(myHelper.getRemainder(15,6));

        System.out.println("is 5 even = " + MathHelper.isEven(5));
        System.out.println("is 22 even = " + MathHelper.isEven(5));

    }
}