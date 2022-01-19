package mathClassMethods;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The minimum of " + a + " and " + b + " is " + Math.min(a, b));

    }
}
