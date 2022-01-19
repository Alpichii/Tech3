package operators.shorthandOperators;

import java.util.Scanner;

public class CountEggs {
    public static void main(String[] args) {
        /*
Imagine that we have 13 eggs in the morning
Ask user how many eggs they had in the breakfast
And print new result
 */
        Scanner input = new Scanner(System.in);
        System.out.println("how many eggs they had from the breakfast?");
        int endBreakFast = input.nextInt();
        int eggs = 13;

        System.out.println("The number are " + (eggs -= endBreakFast) + " eggs left in the morning");
    }
}
